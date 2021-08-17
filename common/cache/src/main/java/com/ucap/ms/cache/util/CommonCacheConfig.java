package com.ucap.ms.cache.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * redis缓存相关配置
 * @time 2021-08-09
 * @author jjq
 */
@RefreshScope
@RestController
public class CommonCacheConfig {

    @Value(value = "${redis.config.cacheStrategy}")
    public  String cacheStrategy;
    @Value(value = "${redis.config.redisIp}")
    public  String redisIp;
    @Value(value = "${redis.config.redisPassword}")
    public  String redisPassword;
    @Value(value = "${redis.config.redisPoolMaxActive}")
    public  Integer redisPoolMaxActive;
    @Value(value = "${redis.config.redisPoolMaxIdle}")
    public  Integer redisPoolMaxIdle;
    @Value(value = "${redis.config.redisPoolminIdle}")
    public  Integer redisPoolminIdle;
    @Value(value = "${redis.config.redisPoolMaxWait}")
    public  String redisPoolMaxWait;
    @Value(value = "${redis.config.redisPoolTestOnBorrow}")
    public  String redisPoolTestOnBorrow;
    @Value(value = "${redis.config.redisPoolTestOnReturn}")
    public  String redisPoolTestOnReturn;
    @Value(value = "${redis.config.redisConnectTimeOut}")
    public  String redisConnectTimeOut;
    @Value(value = "${redis.config.redisSoTimeOut}")
    public  String redisSoTimeOut;
    @Value(value = "${redis.config.redisMaxAttempts}")
    public  String redisMaxAttempts;
    @Value(value = "${redis.config.redisClusterName}")
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
}
