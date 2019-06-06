package com.sto.service;

import com.sto.config.RedisManager;
import com.sto.entity.BaseOrganizeArea;
import com.sto.entity.BaseOrganizeEntity;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseOrganizeAreaManager {
    // 本地缓存的过期时间，默认为10分钟。
    public int localCacheExpireMinutes = 10;
    // 是否开启本地缓存共享。
    private boolean isLocalCacheShare = false;

    @Autowired
    private RedisService redisService;
    @Autowired
    private RedisManager redisManager;
    @Autowired
    private BaseOrganizeArea1Mapper area1Mapper;

    public BaseOrganizeEntity getObjectByCodeByCache(String code){
        BaseOrganizeEntity area = null;
        if (StringUtils.isEmpty(code)) {
            return area;
        }
        // string key = "OrganizeByCode:" + code;
        String key = getObjectCodeCacheKey(code);
        //从缓存获取
        BaseOrganizeEntity boe = getLocalCacheObjectByKey(key);
        if (boe != null)
        {
            return boe;
        }


        return area;
    }

    /// <summary>
    /// 根据Key获取本地缓存的缓存对象。
    /// </summary>
    /// <param name="key">与缓存对象ID关联的Key值。</param>
    /// <param name="refreshCache">是否刷新缓存</param>
    /// <param name="useDb">是否从数据库读取</param>
    /// <returns>缓存的<see cref="BaseOrganizeEntity"/>实体。</returns>
    private static BaseOrganizeEntity getLocalCacheObjectByKey(String key)
    {
        BaseOrganizeEntity boe = null;
        int retryCount = 0;

        return boe;
    }

    /// <summary>
    /// 获取组织机构实体以Code搜索时在缓存中的Key。
    /// </summary>
    /// <param name="code">组织机构实体的Code值。</param>
    /// <returns>缓存Key。</returns>
    public String getObjectCodeCacheKey(String code) {
        return "OBC:" + code;
    }

    /**
     * 通过 区/县code获取区域范围
     *
     * @param areaCode     区/县code
     * @param localCache
     * @param fefreshCache
     * @param useDb
     * @return
     */
    public List<BaseOrganizeArea> getListByAreaCodeByCache(String areaCode, boolean localCache, boolean fefreshCache, boolean useDb) {
        List<BaseOrganizeArea> result = null;
        String key = "AreaCode:";
        if (!StringUtils.isEmpty(areaCode)) {
            key = key + areaCode;
        }
        if (!fefreshCache) {
            if (localCache) {//从缓存中获取
                // TODO  从缓存中获取

            }
//            result = redisService.getList(key, BaseOrganizeArea.class);
            result = redisManager.GetListCacheCommon(key);
        }
        if (result == null) {
            if (useDb) {
                result = getListByAreaCode(areaCode);
            }
            // 若是空的不用缓存，继续读取实体
            if (result != null) {
//                redisService.set(key, result, 600L);
                redisManager.SetListCacheCommon(key, result, 600L);
                if (localCache) {
                    // TODO  加入缓存
                }
            }
        }
        System.out.println(" result.size() = " + result.size());
        return result;
    }

    public List<BaseOrganizeArea> getListByAreaCode(String areaCode) {
        return area1Mapper.getAreaListBycode(areaCode);
    }

    /**
     * 一个区域的需要解析的关键字列表
     * @param areaCode
     * @param address
     * @param endsWith
     * @param localCache
     * @return
     */
    public List<String> getAreaKeys(String areaCode, String address, String endsWith, boolean localCache) {
        List<String> keys = new ArrayList<String>();
        String key = "AreaKeys:" + areaCode;
        if (localCache) {
            // TODO  从缓存中获取
        }
        if (keys.size() == 0) {
            // 从缓存里获取列表清单,进行一次本地缓存，提高效率
            List<BaseOrganizeArea> list = getListByAreaCodeByCache(areaCode, true, false, true);
            // 这里可以算法改进，只存关键字，这样效率高，减少内存存储空间
            // 暴力搜索功能实现？效率低但是还是比人工强大多了去
            list.forEach(area -> {
                if (!StringUtils.isEmpty(area.getRoadName()) && !keys.contains(area.getRoadName())) {
                    keys.add(area.getRoadName());
                }
                // 分单关键字，路名字都可以变成为查询的条件
                if (!StringUtils.isEmpty(area.getPlaceName()) && !keys.contains(area.getPlaceName())) {
                    keys.add(area.getPlaceName());
                }
            });
            if (localCache && keys.size() > 0) {
                // TODO  存入本地缓存
            }
        }
        List<String> result = new ArrayList<String>();
        keys.forEach(area -> {
            if (!StringUtils.isEmpty(area) && address.contains(area)) {
                if (StringUtils.isEmpty(endsWith) || area.endsWith(endsWith)) {
                    result.add(area);
                }
            }
        });
        return result;
    }


    /**
     * 一个区域的需要解析的关键字列表
     * @param areaCode  分单区域
     * @param cityName  城市
     * @param districtName  区域名称
     * @param address   地址
     * @param roadNumber
     * @param endsWith
     * @param localCache
     * @return  哪些关键字在这个地址里
     */
    public List<String> getAreaKeys(String areaCode, String cityName, String districtName, String address, int roadNumber, String endsWith, boolean localCache) {
        List<String> result = getAreaKeys(areaCode, address, endsWith, localCache);
        //lamdba 表达式 ->   长度按长到小进行排序，
//        Collections.sort(result, (String h1, String h2) -> h2.length() - h1.length());
        result.sort((String h1, String h2) -> getKeyWeight(cityName, districtName, roadNumber>0, h2) - getKeyWeight(cityName, districtName, roadNumber>0, h1));

        System.out.println(result);
        return result;
    }


    /**
     * 获取关键字的权重
     * @param cityName   城市
     * @param districtName 区域
     * @param roadNumber    有路号
     * @param keyName   关键字
     * @return      权重
     */
    public static int getKeyWeight(String cityName, String districtName, boolean roadNumber, String keyName) {
        // 不让路优先分
        int result = 14;
        if (isLine(keyName)) {
            result = 10;
        } else {
            // 关键字若跟城市名字一样了，需要超级低的排序
            if (keyName.equals(cityName)) {
                result = 96;
            }
            // 关键字若是跟区的名字一样，也需要很低的优先级别
            if (keyName.equals(districtName)) {
                result = 95;
            }
            if (keyName.endsWith("区")) {
                result = 10;
            }
            // 开发区
            if (keyName.endsWith("开发区")) {
                result = 85;
            } else if (keyName.endsWith("社区") || keyName.endsWith("小区") || keyName.endsWith("苑") || keyName.endsWith("村")) {
                result = 10;
            } else if (keyName.endsWith("大厦") || keyName.endsWith("楼")) {
                result = 8;
            } else if (keyName.endsWith("期")) {
                result = 7;
            }
            if (keyName.endsWith("广场")) {
                result = 15;
            } else if (keyName.endsWith("街道")) {
                // 2019-05-07 街道 大道
                result = 50;
            } else if (keyName.endsWith("镇")) {
                result = 60;
            } else if (keyName.endsWith("乡")) {
                result = 70;
            } else if (keyName.endsWith("县")) {
                result = 80;
            } else if (keyName.endsWith("申通")) {
                result = 99;
            }
        }

        // 权重后面，再加上长度排序
        // 0 代表前面补充0
        // 2 代表长度为2
        // d 代表参数为正数型
        String str = String.format("%02d", 99 - keyName.length());
        result = Integer.valueOf(result + str);
//        result = result + String.valueOf(99 - keyName.length()).PadLeft(2, '0');
        return result;
    }

    // 是一个线，不是一个点，一个区域
    // <param name="keyName">关键字</param>
    public static boolean isLine(String keyName) {
        boolean result = false;
        if (!StringUtils.isEmpty(keyName)) {
            if (keyName.endsWith("路")
                    || keyName.endsWith("弄")
                    || keyName.endsWith("道")
                    || keyName.endsWith("街")
                    || keyName.endsWith("环")
                    || keyName.endsWith("线")
                    || keyName.endsWith("段")
                    || keyName.endsWith("巷")
                    || keyName.endsWith("巷子")) {
                result = true;
                if (keyName.endsWith("街道")) {
                    result = false;
                }
            }
        }
        return result;
    }

}
