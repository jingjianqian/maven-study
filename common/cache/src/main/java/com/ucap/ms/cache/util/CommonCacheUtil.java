package com.ucap.ms.cache.util;

import com.ucap.ms.base.utils.BaseTools;
import com.ucap.ms.cache.service.CommonCacheService;
import com.ucap.ms.cache.service.imp.redis.CommonCacheSingleRedisSer;
import jdk.nashorn.internal.objects.annotations.Property;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class CommonCacheUtil {

    @Resource
    private CmCacheConfig cmCacheConfig;
    @Resource
    private CommonCacheSingleRedisSer commonCacheSingleRedisSer;


    public CommonCacheUtil(){
        logger.info("CommonCacheUtil contructor" +this.getClass().getName());
    }

    private   Logger logger = Logger.getLogger(CommonCacheUtil.class);
    private   Map<String, CommonCacheService> serviceMap = new ConcurrentHashMap<String, CommonCacheService>();

    public  <T> CommonCacheService<T> getCache(String appName) {
        String cacheStrategy = cmCacheConfig.getCacheStrategy();
        if ("redis".equals(cacheStrategy)) {
            String redisIps = cmCacheConfig.getRedisIp();
            if(BaseTools.checkEmpty(redisIps)) {
                logger.error("redis缓存服务器不能为空");
            }

            CommonCacheService service = serviceMap.get(appName);
            if(service == null) {
                commonCacheSingleRedisSer.CommonCacheSingleRedisSerTest(appName);
                service = commonCacheSingleRedisSer;
                serviceMap.put(appName,service);
            }
            return service;
        } else if ("memcache".equals(cacheStrategy)) {
            logger.error("暂不支持memcache");
        }
        return null;
    }

}
