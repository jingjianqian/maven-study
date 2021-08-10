package com.ucap.ms.cache.aspect;

import com.ucap.ms.base.enums.CacheCodeEnum;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @apiNote  缓存注解，主要配合AOP切入缓存相关
 * @author jjq
 * @time 20210810
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface CacheAspectAnnotation {
    /**
     * 操作类型
     * SELECT 查询操作
     * DDL 增删改
     */
    enum OPERATIONS {
        SELECT,
        DDL
    }

    /** 操作类型 */
    OPERATIONS operation() default OPERATIONS.SELECT;
    /**数据对象key*/
    String dataKey();

    /**
     * redis key值表达式
     * @return String 返回key
     */
    String paramsKeyEl() default "";
    /** redis 分区常量 */
    CacheCodeEnum cacheCode();

    /**
     * 超时配置 默认minuts
     * @return 返回超时为多少分钟
     */
    int expire() default 0;

    /**是否读取缓存开关*/
    public final static String BOOLEAN_READ_REDIS = "_READ_REDIS";
}
