package com.ucap.ms.cache.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * redis缓存相关配置
 * @time 2021-08-09
 * @author jjq
 */
@Component
@RefreshScope
@Order(Ordered.LOWEST_PRECEDENCE - 1)
public class CommonCacheConfig implements Serializable {

    @Value("${redis.config.cacheStrategy}")
    public  String cacheStrategy;
    @Value("${redis.config.redisIp}")
    public  String redisIp;
    @Value("${redis.config.redisPassword}")
    public  String redisPassword;
    @Value("${redis.config.redisPoolMaxActive}")
    public  Integer redisPoolMaxActive;
    @Value( "${redis.config.redisPoolMaxIdle}")
    public  Integer redisPoolMaxIdle;
    @Value("${redis.config.redisPoolminIdle}")
    public  Integer redisPoolminIdle;
    @Value("${redis.config.redisPoolMaxWait}")
    public  String redisPoolMaxWait;
    @Value( "${redis.config.redisPoolTestOnBorrow}")
    public  String redisPoolTestOnBorrow;
    @Value("${redis.config.redisPoolTestOnReturn}")
    public  String redisPoolTestOnReturn;
    @Value("${redis.config.redisConnectTimeOut}")
    public  String redisConnectTimeOut;
    @Value("${redis.config.redisSoTimeOut}")
    public  String redisSoTimeOut;
    @Value("${redis.config.redisMaxAttempts}")
    public  String redisMaxAttempts;
    @Value("${redis.config.redisClusterName}")
    public  String redisClusterName;

    public String getCacheStrategy() {
        return cacheStrategy;
    }

    public String getRedisIp() {
        return redisIp;
    }

    public String getRedisPassword() {
        return redisPassword;
    }

    public Integer getRedisPoolMaxActive() {
        return redisPoolMaxActive;
    }

    public Integer getRedisPoolMaxIdle() {
        return redisPoolMaxIdle;
    }

    public Integer getRedisPoolminIdle() {
        return redisPoolminIdle;
    }

    public String getRedisPoolMaxWait() {
        return redisPoolMaxWait;
    }

    public String getRedisPoolTestOnBorrow() {
        return redisPoolTestOnBorrow;
    }

    public String getRedisPoolTestOnReturn() {
        return redisPoolTestOnReturn;
    }

    public String getRedisConnectTimeOut() {
        return redisConnectTimeOut;
    }

    public String getRedisSoTimeOut() {
        return redisSoTimeOut;
    }

    public String getRedisMaxAttempts() {
        return redisMaxAttempts;
    }

    public String getRedisClusterName() {
        return redisClusterName;
    }

    public void setCacheStrategy(String cacheStrategy) {
        this.cacheStrategy = cacheStrategy;
    }

    public void setRedisIp(String redisIp) {
        this.redisIp = redisIp;
    }

    public void setRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
    }

    public void setRedisPoolMaxActive(Integer redisPoolMaxActive) {
        this.redisPoolMaxActive = redisPoolMaxActive;
    }

    public void setRedisPoolMaxIdle(Integer redisPoolMaxIdle) {
        this.redisPoolMaxIdle = redisPoolMaxIdle;
    }

    public void setRedisPoolminIdle(Integer redisPoolminIdle) {
        this.redisPoolminIdle = redisPoolminIdle;
    }

    public void setRedisPoolMaxWait(String redisPoolMaxWait) {
        this.redisPoolMaxWait = redisPoolMaxWait;
    }

    public void setRedisPoolTestOnBorrow(String redisPoolTestOnBorrow) {
        this.redisPoolTestOnBorrow = redisPoolTestOnBorrow;
    }

    public void setRedisPoolTestOnReturn(String redisPoolTestOnReturn) {
        this.redisPoolTestOnReturn = redisPoolTestOnReturn;
    }

    public void setRedisConnectTimeOut(String redisConnectTimeOut) {
        this.redisConnectTimeOut = redisConnectTimeOut;
    }

    public void setRedisSoTimeOut(String redisSoTimeOut) {
        this.redisSoTimeOut = redisSoTimeOut;
    }

    public void setRedisMaxAttempts(String redisMaxAttempts) {
        this.redisMaxAttempts = redisMaxAttempts;
    }

    public void setRedisClusterName(String redisClusterName) {
        this.redisClusterName = redisClusterName;
    }
}
