package com.ucap.ms;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * aop 测试
 */
@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE - 2)
public class CaAspect {

    private final static Logger logger = LoggerFactory.getLogger(CaAspect.class);


    /**
     * 切入点
     */
    @Pointcut("@annotation(CaAnnotation) ")
    public void access(){
        logger.info("切入点声明！！！");
    }


    @Before("access()")
    public void before(JoinPoint joinPoint){
        logger.info("before from aop");
    }
    /**
     * redis 环绕通知AOP
     * @return
     */
    @Around("access()&&@annotation(caAnnotation)")
    public void execute(ProceedingJoinPoint proceedingJoinPoint, CaAnnotation caAnnotation){
        logger.info("Around。。。。。");
    }

    @After("access()")
    public void after(JoinPoint joinPoint){
        logger.info("after method from aop");
    }

}
