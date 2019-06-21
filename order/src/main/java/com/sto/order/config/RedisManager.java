package com.sto.order.config;

import com.sto.order.entity.BaseOrganizeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis操作类
 */
@Component
public class RedisManager {
    private static final Logger logger = LoggerFactory.getLogger(RedisManager.class);
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    /**
     * 设置缓存
     * @param key  缓存键
     * @param value  对象
     * @param expireTime 过期时间，默认一小时
//     * @param <T>
     * @return
     */
    public <T> boolean  SetListCacheCommon(final String key, List<T> value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Object, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value, expireTime, TimeUnit.SECONDS);
//            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            logger.error("set error: key {}, value {},expireTime {}",key,value,expireTime,e);
        }
        return result;
    }

    /**
     * 获取缓存列表 elastic
     * @param key
     * @param <T>
     * @return
     */
    public <T> List<T> GetListCacheCommon(String key){
        List<T> result = null;
        if (!StringUtils.isEmpty(key)) {
            result = (List<T>)redisTemplate.opsForValue().get(key);
        }
        return result;
    }

    /**
     * 从缓存获取获取实体
     * @param id
     * @return
     */
    public static BaseOrganizeEntity getObjectByCache(String id) {
        BaseOrganizeEntity result = null;
        if (!StringUtils.isEmpty(id)) {

        }

        return result;
    }

}
