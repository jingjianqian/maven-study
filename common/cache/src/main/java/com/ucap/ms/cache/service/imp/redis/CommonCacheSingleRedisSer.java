package com.ucap.ms.cache.service.imp.redis;

import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.base.utils.BaseSerializationUtil;
import com.ucap.ms.base.utils.BaseValidUtil;
import com.ucap.ms.cache.service.CommonCacheService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;


@Component
public class CommonCacheSingleRedisSer<T>  implements CommonCacheService<T> {

    @Resource
    private CommonCacheJedisPool commonCacheJedisPool;


    private int jedisDatabaseIndex;
    private  Logger logger = Logger.getLogger(CommonCacheSingleRedisSer.class);
    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";


    public void  CommonCacheSingleRedisSerTest(String appName) {
        if(commonCacheJedisPool.cacheMap == null || commonCacheJedisPool.cacheMap.size() <= 0) {
            for (CacheCodeEnum code : CacheCodeEnum.values()) {
                commonCacheJedisPool.cacheMap.put(code.getValue(), code.getKey());
            }
        }
        if (BaseValidUtil.isEmpty(commonCacheJedisPool.cacheMap) || BaseValidUtil.isNull(appName) || BaseValidUtil.isEmpty(commonCacheJedisPool.cacheMap.get(appName))) {
            jedisDatabaseIndex = 0;
        } else {
            jedisDatabaseIndex = commonCacheJedisPool.cacheMap.get(appName);
        }
    }

    /** 获得jedis对象 */
    public Jedis getJedis() {
        commonCacheJedisPool.CommonCacheJedisPoolTest();
        return commonCacheJedisPool.getJedis();
    }

    @Override
    public T get(String key) {
        Jedis jedis = null;
        try {
            jedis = getJedis();
            jedis.select(jedisDatabaseIndex);
            byte[] b = jedis.get(key.getBytes());
            return (T) BaseSerializationUtil.deserialize(b);
        } catch (Exception e) {
            logger.error("getCacheObjectByKey:key:" + key + ",error:" + e);
            destoryJedisOjbect(jedis);
            return null;
        } finally {
            recycleJedisToPool(jedis);
        }
    }
    /** 销毁jedis对象 */
    public void destoryJedisOjbect(Jedis jedis) {
        //commonCacheJedisPool.destoryJedisOjbect(jedis);
    }
    public void recycleJedisToPool(Jedis jedis) {
        if (jedis != null) {
            try {
                //commonCacheJedisPool.recycleJedisOjbect(jedis);
            } catch (Exception e) {
                logger.error(e.getMessage(),e);
            }
        }
    }




    public int getJedisDatabaseIndex() {
        return jedisDatabaseIndex;
    }

    public void setJedisDatabaseIndex(int jedisDatabaseIndex) {
        this.jedisDatabaseIndex = jedisDatabaseIndex;
    }


    @Override
    public String getString(String key) {
        return null;
    }

    @Override
	public boolean add(String key, T object) {
		boolean flag = false;
		Jedis jedis = null;
		if (BaseValidUtil.isNotNull(key) && object != null && !"[]".equals(object.toString())) {
			try {
				jedis = getJedis();
				jedis.select(jedisDatabaseIndex);
				String result = jedis.set(key.getBytes(), BaseSerializationUtil.serialize(object));
				if (LOCK_SUCCESS.equals(result)) {
					flag = true;
				}
			} catch (Exception e) {
				logger.error("createCacheObject:key:" + key + "value:" + object + ",error:" + e);
				destoryJedisOjbect(jedis);
			} finally {
				recycleJedisToPool(jedis);
			}
		}

		return flag;
	}

	@Override
	public boolean add(String key, T object, Long overTime) {
        logger.info("===========================================================");
		boolean flag = false;
		Jedis jedis = null;
		if (BaseValidUtil.isNotNull(key) && object != null && !"[]".equals(object.toString())) {
			try {
				jedis = getJedis();
				jedis.select(jedisDatabaseIndex);
				String result = jedis.set(key.getBytes(), BaseSerializationUtil.serialize(object));
				jedis.expire(key.getBytes(),Integer.parseInt(overTime*60+""));
				if (LOCK_SUCCESS.equals(result)) {
					flag = true;
				}
			} catch (Exception e) {
				logger.error("createCacheObject:key:" + key + "value:" + object + ",error:" + e);
				destoryJedisOjbect(jedis);
			} finally {
				recycleJedisToPool(jedis);
			}
		}

		return flag;
	}

	@Override
	public boolean set(String key, T value) {
		return add(key,value);
	}
    @Override
    public boolean setNumber(String key, Long value) {
        return false;
    }

    @Override
    public boolean update(String key, T value) {
        return false;
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public boolean deleteByKeyPrefix(String keyPrefix) {
        return false;
    }

    @Override
    public Long incrBy(String key, Long value) {
        return null;
    }

    @Override
    public Long incrCount(String key, String mapKey, Long value) {
        return null;
    }

    @Override
    public Long hincrBy(String key, String mapKey, Long value, Integer expire) {
        return null;
    }

    @Override
    public Long hset(String key, String mapKey, String value, Integer expire) {
        return null;
    }

    @Override
    public String hget(String key, String mapKey) {
        return null;
    }

    @Override
    public Map<String, String> getHashMapAll(String key) {
        return null;
    }

    @Override
    public boolean getDistributedLock(String lockKey, String requestId, int expireTime) {
        return false;
    }

    @Override
    public boolean releaseDistributedLock(String lockKey, String requestId) {
        return false;
    }

    @Override
    public boolean tryGetDistributedLock(String lockKey, String requestId) {
        return false;
    }

    @Override
    public String getRequestIdByLockKey(String lockKey) {
        return null;
    }

    @Override
    public boolean expire(String key, Long overTime) {
        return false;
    }

    @Override
    public long addForSet(String key, String... value) {
        return 0;
    }

    @Override
    public long deleteForSet(String key, String... value) {
        return 0;
    }

    @Override
    public long lengthForSet(String key) {
        return 0;
    }

    @Override
    public boolean ifExistForSet(String key, String value) {
        return false;
    }

    @Override
    public Set AllForSet(String key) {
        return null;
    }
}
