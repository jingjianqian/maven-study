package com.ucap.ms.cache.service.imp.redis;

import com.ucap.ms.cache.util.CommonCacheConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.util.Pool;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author jjq
 * @date 20210817
 * @description redis连接池
 */
@Component
public class CommonCacheJedisPool {

    @Resource
    private CommonCacheConfig commonCacheConfig;

     HashMap<String, Integer> cacheMap = new HashMap<String, Integer>();
    private Logger log= LoggerFactory.getLogger(CommonCacheJedisPool.class);
    private  CommonCacheJedisPool redisPool;
    private  Pool pool;
    /** 构造方法 **/
    private CommonCacheJedisPool(){
        try{
            String redisAddress= commonCacheConfig.redisIp;
            String test = commonCacheConfig.getRedisIp();
            log.info(redisAddress);
            log.info(test);
            System.out.println("redisAddress:"+redisAddress);
            System.out.println("test:"+test);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }


    public synchronized  CommonCacheJedisPool getInstance() {
        if(redisPool==null) {
            redisPool=new CommonCacheJedisPool();
        }
        return redisPool;
    }

    /** 获得jedis对象 */

    public  Jedis getJedis() {

        return (Jedis) pool.getResource();

    }
}
