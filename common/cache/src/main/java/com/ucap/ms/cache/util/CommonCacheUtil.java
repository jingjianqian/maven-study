package com.ucap.ms.cache.util;

import com.ucap.ms.base.utils.BaseTools;
import com.ucap.ms.cache.service.CommonCacheService;
import com.ucap.ms.cache.service.imp.redis.CommonCacheSingleRedisSer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class CommonCacheUtil {

    @Resource
    private   CommonCacheConfig commonCacheConfig;


    private   Logger logger = Logger.getLogger(CommonCacheUtil.class);
    private   Map<String, CommonCacheService> serviceMap = new ConcurrentHashMap<String, CommonCacheService>();

    public  <T> CommonCacheService<T> getCache(String appName) {
        String cacheStrategy = commonCacheConfig.getCacheStrategy();
        if ("redis".equals(cacheStrategy)) {
            String redisIps = commonCacheConfig.getRedisIp();
            if(BaseTools.checkEmpty(redisIps)) {
                logger.error("redis缓存服务器不能为空");
            }
            CommonCacheService service = serviceMap.get(appName);
            if(service == null) {
                service = (CommonCacheService) new CommonCacheSingleRedisSer(appName);
                serviceMap.put(appName,service);
            }
            return service;
        } else if ("memcache".equals(cacheStrategy)) {
            logger.error("暂不支持memcache");
        }
        return null;
    }

}
