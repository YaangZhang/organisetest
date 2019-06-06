package com.sto.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    private static final Logger logger = LoggerFactory.getLogger(RedisService.class);

    /**
     * set value
     * @param key
     * @param value
     * @return
     */
    public  <T> boolean set(final String key, T value) {
        boolean result = false;
        if (StringUtils.isEmpty(key)) {
            return result;
        }
        //任意类型转换成String
        String valueStr = beanToString(value);
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            operations.set(key, valueStr);
            result = true;
        } catch (Exception e) {
            logger.error("set error: key {}, value {}",key,value,e);
        }
        return result;
    }

    /**
     * set value with expireTime
     * @param key
     * @param value
     * @param expireTime
     * @return
     */
    public  <T> boolean set(final String key, T value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            //任意类型转换成String
            String valueStr = beanToString(value);
            operations.set(key, valueStr);
            stringRedisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            logger.error("set error: key {}, value {},expireTime {}",key,value,expireTime,e);
        }
        return result;
    }

    /**
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * @param key
     * @return String
     */
    public String get(final String key) {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        return operations.get(key);
    }
    /**
     * @param key
     * @return
     */
    public <T> List<T> getList(final String key, Class<T> clazz) {
        String result = null;
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        result = operations.get(key);
        return stringToList(result,clazz);
    }

    /**
     * remove single key
     * @param key
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * batch delete
     * @param keys
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }
    /**
     * batch delete with pattern
     * 使用 Redis 的 Pattern 来匹配出一批符合条件的缓存，然后批量进行删除。
     * @param pattern
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    /**
     * hash set
     * @param key
     * @param hashKey
     * @param value
     */
    public void hashSet(String key, Object hashKey, Object value){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put(key,hashKey,value);
    }

    /**
     * hash get
     * @param key
     * @param hashKey
     * @return
     */
    public Object hashGet(String key, Object hashKey){
        HashOperations<String, Object, Object>  hash = redisTemplate.opsForHash();
        return hash.get(key,hashKey);
    }

    /**
     *  list push
     * @param k
     * @param v
     */
    public void push(String k,Object v){
        ListOperations<String, Object> list = redisTemplate.opsForList();
        list.rightPush(k,v);
    }

    /**
     *  list range
     * @param k
     * @param l
     * @param l1
     * @return
     */
    public List<Object> range(String k, long l, long l1){
        ListOperations<String, Object> list = redisTemplate.opsForList();
        return list.range(k,l,l1);
    }

    /**
     *  set add
     * @param key
     * @param value
     */
    public void setAdd(String key,Object value){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        set.add(key,value);
    }

    /**
     * set get
     * @param key
     * @return
     */
    public Set<Object> setMembers(String key){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        return set.members(key);
    }

    /**
     * ordered set add
     * @param key
     * @param value
     * @param scoure
     */
    public void zAdd(String key,Object value,double scoure){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        zset.add(key,value,scoure);
    }

    /**
     * rangeByScore
     * @param key
     * @param scoure
     * @param scoure1
     * @return
     */
    public Set<Object> rangeByScore(String key,double scoure,double scoure1){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        return zset.rangeByScore(key, scoure, scoure1);
    }


    @SuppressWarnings("unchecked")
    private <T> List<T> stringToList(String value, Class<T> clazz) {
        if(value==null||value.length()<=0||clazz==null){
            return null;
        }
        List<T> List = (List<T>)JSONArray.parseArray(value, clazz);
        System.out.println("JSONArray.parseArray = "+List);
//        List<T> List = JSON.parseObject(value, new TypeReference<List<T>>() {
//        });
        return List;
    }
    /**
     * String  类型 转实体
     * @param value  String value
     * @param clazz
     * @param <T>
     * @return
     */
    private <T> T stringToBean(String value, Class<T> clazz) {
        if(value==null||value.length()<=0||clazz==null){
            return null;
        }

        if(clazz ==int.class ||clazz==Integer.class){
            return (T)Integer.valueOf(value);
        }
        else if(clazz==long.class||clazz==Long.class){
            return (T)Long.valueOf(value);
        }
        else if(clazz==String.class){
            return (T)value;
        }else {
            return JSON.toJavaObject(JSON.parseObject(value),clazz);
        }
    }

    /**
     *
     * @param value  T value
     * @param <T>  任意类型
     * @return     String
     */
    private <T> String beanToString(T value) {
        if(value==null){
            return null;
        }
        Class <?> clazz = value.getClass();
        if(clazz==int.class||clazz==Integer.class){
            return ""+value;
        }
        else if(clazz==long.class||clazz==Long.class){
            return ""+value;
        }
        else if(clazz==String.class){
            return (String)value;
        }else {
            return JSON.toJSONString(value);
        }
    }
}