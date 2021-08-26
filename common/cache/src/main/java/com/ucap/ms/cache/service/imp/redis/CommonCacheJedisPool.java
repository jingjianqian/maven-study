package com.ucap.ms.cache.service.imp.redis;

import com.ucap.ms.cache.util.CmCacheConfig;
import com.ucap.ms.cache.util.CommonCacheConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.util.Pool;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jjq
 * @date 20210817
 * @description redis连接池
 */
@Component
@Order(100)
public class CommonCacheJedisPool {

    @Resource
    private CommonCacheConfig commonCacheConfig;

    @Resource
    private CmCacheConfig cmCacheConfig;



    HashMap<String, Integer> cacheMap = new HashMap<String, Integer>();
    JedisPoolConfig config = new JedisPoolConfig();// 创建jedis池配置实例
    private Logger log= LoggerFactory.getLogger(CommonCacheJedisPool.class);
    private  CommonCacheJedisPool redisPool;
    private  Pool pool;
    /** 构造方法 **/
    public void  CommonCacheJedisPoolTest(){
        try {
            String redisAddress= commonCacheConfig.getRedisIp();
            //分号分割代表多个 ; 此处采用哨兵redis主从模式
            String password = commonCacheConfig.getRedisPassword();

            // 设置池配置项值
            config.setMaxTotal(commonCacheConfig.getRedisPoolMaxActive());
            config.setMaxIdle(commonCacheConfig.getRedisPoolMaxIdle());
            // 表示idle object evitor两次扫描之间要sleep的毫秒数
            config.setTimeBetweenEvictionRunsMillis(30000);
            // 表示idle object evitor每次扫描的最多的对象数
            config.setNumTestsPerEvictionRun(10);
            config.setMinIdle(commonCacheConfig.getRedisPoolminIdle());
            config.setMaxWaitMillis(Long.valueOf(commonCacheConfig.getRedisPoolMaxWait()));
            config.setTestOnBorrow(Boolean.valueOf(commonCacheConfig.getRedisPoolTestOnBorrow()));

            // Idle时进行连接扫描
            config.setTestWhileIdle(true);
            config.setTestOnReturn(Boolean.valueOf(commonCacheConfig.getRedisPoolTestOnReturn()));

            if(redisAddress.indexOf(";")>0) {
                Set<String> sentinels = new HashSet<String>();
                String redisIps[]=redisAddress.split(";");
                for (int i = 0; i < redisIps.length; i++) {
                    sentinels.add(redisIps[i]);
                }
                String clusterName =new CmCacheConfig().redisClusterName;
                pool = new JedisSentinelPool(clusterName, sentinels, config,password);
            }else {
                String ips=commonCacheConfig.getRedisIp();
                String ip=ips.split(":")[0];
                int port=Integer.parseInt(ips.split(":")[1]);
                int connTimeOut=Integer.parseInt(commonCacheConfig.getRedisConnectTimeOut());
                // 根据配置实例化jedis池
                pool = new JedisPool(config,ip,port,connTimeOut,password);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("redis缓存构建失败"+e);
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
