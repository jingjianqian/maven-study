package com.ucap.ms.cache.aspect;

import com.ucap.ms.base.data.ResultModel;
import com.ucap.ms.base.exception.GlobalBaseErrorCode;
import com.ucap.ms.base.model.BaseModel;
import com.ucap.ms.base.utils.BaseTools;
import com.ucap.ms.cache.service.CommonCacheService;
import com.ucap.ms.cache.util.CmCacheConfig;
import com.ucap.ms.cache.util.CommonCacheConfig;
import com.ucap.ms.cache.util.CommonCacheUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

/**
 * @author jjq
 * @time  20210810
 * @apiNote  AOP切入CacheAspectAnnotation注解处进行缓存相关操作
 */
@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE - 2)
public class CacheAspect {
    private final static Logger logger = LoggerFactory.getLogger(CacheAspect.class);
    private final static String CACHE_ANNOTATION = CacheAnnotation.class.getSimpleName();

    @Resource
    private CommonCacheConfig commonCacheConfig;

    @Resource
    private CommonCacheUtil commonCacheUtil;

    @Resource
    private CmCacheConfig cmCacheConfig;

    /**
     * 切入点
     */
    @Pointcut("@annotation(CacheAnnotation) ")
    public void access(){

    }


    @Before("access()")
    public void before(JoinPoint joinPoint){

    }
    /**
     * redis 环绕通知AOP
     * @return
     */
    @Around("access()&&@annotation(cacheAnnotation)")
    public Object execute(ProceedingJoinPoint proceedingJoinPoint, CacheAnnotation cacheAnnotation) throws Throwable {
        Object result = null;
        try {
            /** 缓存实例*/
            String cacheInstanceName = cacheAnnotation.cacheCode().getValue();

            /** 获取缓存服务 **/
            CommonCacheService<Object> commonCacheService = commonCacheUtil.getCache(cacheInstanceName);
            /** 方法对象 **/
            Method method = getMethod(proceedingJoinPoint);
            // 参数
            Object[] args = proceedingJoinPoint.getArgs();

            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes)ra;
            HttpServletRequest request = sra.getRequest();

            String listKey = initKey(cacheAnnotation, proceedingJoinPoint, method);

            if(BaseTools.checkEmpty(listKey)){
                result = proceedingJoinPoint.proceed(args);
                logger.info(CACHE_ANNOTATION + "-listKey is empty");
                return result;
            }
            listKey = CACHE_ANNOTATION + "_" + cacheAnnotation.dataKey() + "_LIST_" + listKey;
            switch (cacheAnnotation.operation()) {
                case SELECT:
                    Object obj = commonCacheService.get(listKey);
                    if (obj != null && (request == null || !"true".equals(request.getParameter(CacheAnnotation.FLAG_LOAD_SOURCE_DATA)))) {
                        result = obj;
                        logger.info(CACHE_ANNOTATION + "-hit：listKey = " + listKey);
                    } else {
                        boolean cacheResult = false;
                        result = proceedingJoinPoint.proceed(args);
                        if (result instanceof ResultModel) {
                            ResultModel model = (ResultModel) result;
                            if (model.getCode() == GlobalBaseErrorCode.SUCCESS.getCode()) {
                                if(cacheAnnotation.expire() > 0) {
                                    cacheResult = commonCacheService.add(listKey, result, (long) cacheAnnotation.expire());
                                } else {
                                    cacheResult = commonCacheService.set(listKey, result);
                                }
                                logger.info(CACHE_ANNOTATION + "-set：listKey = " + listKey
                                        + ",cacheResult = " + cacheResult);
                            }else{
                                if(cacheAnnotation.expire() > 0){
                                    cacheResult = commonCacheService.add(listKey, result, (long) cacheAnnotation.expire());
                                }else{
                                    cacheResult = commonCacheService.set(listKey, result);
                                }
                                logger.info(CACHE_ANNOTATION + "-set：listKey = " + listKey + "," + result.getClass().getName()
                                        + ",cacheResult = " + cacheResult);
                            }
                        }
                    }
                    break;
                case DDL:
                    result = proceedingJoinPoint.proceed(args);
                    if (result instanceof ResultModel) {
                        ResultModel ResultModel = (ResultModel) result;
                        if (ResultModel.getCode() == GlobalBaseErrorCode.SUCCESS.getCode()) {
                            // 清除对应查询缓存
                            String dataKey = CACHE_ANNOTATION + "_" + cacheAnnotation.dataKey() + "_LIST";
                            boolean cacheResult = commonCacheService.deleteByKeyPrefix(dataKey);
                            logger.info(CACHE_ANNOTATION + "-deleteByKeyPrefix：keyPrefix= " + dataKey
                                    + ",cacheResult = " + cacheResult);
                        }
                    }
                    break;
                default:
                    result = proceedingJoinPoint.proceed();
                    break;
            }



        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return result;

    }

    @After("access()")
    public void after(JoinPoint joinPoint){

    }


    /**
     * 获取被拦截方法对象
     */
    private Method getMethod(JoinPoint joinPoint) throws Exception {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        return methodSignature.getMethod();
    }


    private String initKey(CacheAnnotation cacheAnnotation, ProceedingJoinPoint proceedingJoinPoint,
                           Method method) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        // 获取被拦截方法参数名列表(使用Spring支持类库)
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        String[] paraNameArr = u.getParameterNames(method);

        String paramKeyEl = cacheAnnotation.paramsKeyEl();
        String key = "";
        if (!BaseTools.checkEmpty(paramKeyEl)) {
            // 使用SPEL进行key的解析
            ExpressionParser parser = new SpelExpressionParser();
            // SPEL上下文
            StandardEvaluationContext context = new StandardEvaluationContext();
            // 把方法参数放入SPEL上下文中
            for (int i = 0; i < paraNameArr.length; i++) {
                context.setVariable(paraNameArr[i], args[i]);
            }
            Object object = parser.parseExpression(paramKeyEl).getValue(context);
            if(object != null){
                if(object instanceof String){
                    key = object.toString();
                }else if(object instanceof BaseModel){
                    key = String.valueOf(((BaseModel)object).getId());
                }
                logger.info(CACHE_ANNOTATION + "-parse paramKeyEl result：" + key);
            }
        }

        if(BaseTools.checkEmpty(key)) key = serialize(args);

        return BaseTools.MD5(key);


    }

    private String serialize(Object obj) throws Throwable {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        String str = bos.toString("UTF-8");
        oos.close();
        bos.close();
        return str;
    }

}
