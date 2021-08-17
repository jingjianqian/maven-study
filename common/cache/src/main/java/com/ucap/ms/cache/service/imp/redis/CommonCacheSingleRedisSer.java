package com.ucap.ms.cache.service.imp.redis;

import com.ucap.ms.cache.service.CommonCacheService;

import java.util.Map;
import java.util.Set;

public class CommonCacheSingleRedisSer<T>  implements CommonCacheService<T> {

    public CommonCacheSingleRedisSer(String appName) {
        if(CommonCacheJedisPool.cacheMap == null || CacheMyJedisPool.cacheMap.size() <= 0) {

        }
    }

    @Override
    public T get(String key) {
        return null;
    }

    @Override
    public String getString(String key) {
        return null;
    }

    @Override
    public boolean add(String key, T value) {
        return false;
    }

    @Override
    public boolean add(String key, T value, Long overTime) {
        return false;
    }

    @Override
    public boolean set(String key, T value) {
        return false;
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
