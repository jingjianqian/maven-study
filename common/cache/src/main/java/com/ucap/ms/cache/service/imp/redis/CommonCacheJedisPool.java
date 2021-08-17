package com.ucap.ms.cache.service.imp.redis;

import com.ucap.ms.cache.util.CommonCacheConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author jjq
 * @date 20210817
 * @description redis连接池
 */
public class CommonCacheJedisPool {

    static HashMap<String, Integer> cacheMap = new HashMap<String, Integer>();
    private Logger log= LoggerFactory.getLogger(CommonCacheJedisPool.class);
    private static CommonCacheJedisPool redisPool;
    CommonCacheConfig commonCacheConfig = new CommonCacheConfig();
    /** 构造方法 **/
    private CommonCacheJedisPool(){
        String redisAddress= new CommonCacheConfig().redisIp;
        String test = commonCacheConfig.getRedisIp();
        log.info(redisAddress);
        log.info(test);
    }
}
