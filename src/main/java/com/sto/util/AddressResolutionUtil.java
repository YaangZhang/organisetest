/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: AddressResolutionUtil
 * Author:   Administrator
 * Date:     2019-04-17 19:01
 * Description: 从地址串中解析提取省市区
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.util;/**
 * Created by Administrator on 2019-04-17.
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
// import org.apache.commons.io.IOUtils;
import com.sto.vo.CityBean;
import com.sto.vo.DistrictBean;
import com.sto.vo.ProvinceBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import sun.misc.IOUtils;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从地址串中解析提取省市区〉
 *
 * @author Administrator
 * @create 2019-04-17
 * @since 1.0.0
 */
public class AddressResolutionUtil<T> {

    @Value("classpath:static/china_city_data.json")
    private static Resource areaRes;

    /**
     * 解析地址
     * @author lin
     * @param address
     * @return
     */
    public static Map<String,String> addressResolution(String address){
        // System.out.println("解析地址 address : "+address);
        String regex="(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)";

        // String regex="(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.+盟|市辖区|.*?市|.*?区|.*?县)(?<county>[^县]+县|.+区|.+市|.*?镇|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)|(?<getcyv>^[\\u2E80-\\u9FFF]+$)";
        Matcher m= Pattern.compile(regex).matcher(address);
        String province=null,city=null,county=null,town=null,village=null, getcyv=null;
        // List<Map<String,String>> table=new ArrayList<Map<String,String>>();
        Map<String,String> row=null;
        while(m.find()){
            row=new LinkedHashMap<String,String>();
            province=m.group("province");
            row.put("province", province==null?"":province.trim());
            city=m.group("city");
            row.put("city", city==null?"":city.trim());
            county=m.group("county");
            row.put("county", county==null?"":county.trim());
            town=m.group("town");
            row.put("town", town==null?"":town.trim());
            village=m.group("village");
            row.put("village", village==null?"":village.trim());

            // getcyv=m.group("getcyv");
            // row.put("getcyv", getcyv==null?"":getcyv.trim());

            // table.add(row);
        }
        System.out.println("解析地址 row : "+row);
        System.out.println("……………………………………………………………………………………");
        return row;
    }

    /**
     * 读取静态文件
     * @param fileName
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getAreaList(String fileName, Class<T> clazz){
        try {
            Resource resource = new ClassPathResource(fileName);
            // Resource resources = new PathMatchingResourcePatternResolver().getResource("classpath:static/china_city_data.json");
            // String jsonStr = new String(IOUtils.readFully(resource.getInputStream(), -1,true));
            if (resource.exists()) {
                Type type = new TypeReference<ArrayList<T>>() {
                }.getType();
                ArrayList<T> parseObject = JSON.parseObject(resource.getInputStream(), type,
                        // 自动关闭流
                        Feature.AutoCloseSource,
                        // 允许注释
                        Feature.AllowComment,
                        // 允许单引号
                        Feature.AllowSingleQuotes,
                        // 使用 Big decimal
                        Feature.UseBigDecimal);

                System.out.println("parseObject : "+parseObject);
                List<T> parseArray = JSON.parseArray(parseObject.toString(), clazz);
                return parseArray;
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getDistrictCode(String pro, String city, String dis){
        List<ProvinceBean> provinceBeans = getAreaList("static/china_city_data.json", ProvinceBean.class);
        if (provinceBeans == null) {
            return null;
        }
        try {
            for (ProvinceBean province : provinceBeans) {
                if (province.getName().equals(pro)) {
                    ArrayList<CityBean> cityList = province.getCityList();
                    for (CityBean cityBean : cityList) {
                        if (cityBean.getName().equals(city)) {
                            ArrayList<DistrictBean> districts = cityBean.getCityList();
                            for (DistrictBean district : districts) {
                                if (district.getName().equals(dis)) {
                                    return district.getId();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        // System.out.println(addressResolution("上海市上海市静安区南京东路人民广场"));
        // System.out.println(addressResolution("辽宁省大连市甘井子区红旗西路384号万科西山天街一期物业办公室门口(丰巢)"));
        // System.out.println(addressResolution("辽宁省大连市甘井子区南关岭街道岚岭路中华城对面北市综合体项目工地（靠近云岭北园公交站）"));
        Map<String, String> stringMap7 = addressResolution("辽宁省大连市中山区金城街2A汇邦中心一楼大堂快递收发室(丰巢)");
        Map<String, String> stringMap = addressResolution("辽宁省大连市中山区清爽街1号兴昌久百年");
        Map<String, String> stringMap4 = addressResolution("辽宁省大连市沙河口区星岛园12号");
        Map<String, String> stringMap5 = addressResolution("辽宁省大连市甘井子区南关岭街道岚岭路10号中华城对面北市综合体项目工地（靠近云岭北园公交站）");
        Map<String, String> stringMap1 = addressResolution("辽宁省大连市甘井子区红旗西路384号万科西山天街一期物业办公室门口(丰巢)");
        Map<String, String> stringMap2 = addressResolution("上海市上海市静安区南京东路人民广场");
        Map<String, String> stringMap3 = addressResolution("辽宁省大连市甘井子区芳林街唯美品格1号岗2号丰巢快递柜(丰巢)");
        Map<String, String> stringMap6 = addressResolution("辽宁省大连市甘井子区芳林街5号大件路唯美品格1号岗2号丰巢快递柜(丰巢)");
        Map<String, String> stringMap8 = addressResolution("辽宁省大连市甘井子区辽宁省大连市甘井子区汇德东园17号楼加州洋房物业办公室（岗亭南面）(丰巢)");
        Map<String, String> stringMap9 = addressResolution("辽宁省大连市瓦房店市西郊工业园区花园路花园小区7号楼");


        //解析 街道/路/地址
        String regex="(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)(?<street>[^街]+街道|.*?街|)?(?<streetNum>[^号]+号|)?(?<road>[^路]+路|.*?路|.*?道)(?<roadNum>[^号]+号|)?(?<location>[`小区]+大厦|.*?广场|.*?小区|.*?园区|)?(?<address>.*)";
        //解析 道路/街道/地址  道路/地址
        String regex1="(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)(?<road>[^路]+路|.*?路|.*?道)(?<roadNum>[^号]+号|)?(?<street>[^街]+街道|.*?街|)?(?<streetNum>[^号]+号|)?(?<location>[`小区]+大厦|.*?广场|.*?小区|.*?园区|)?(?<address>.*)";
        //解析 街道/地址
        String regex2="(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)(?<street>[^街]+街道|.*?街|)?(?<streetNum>[^号]+号|)?(?<location>[`小区]+大厦|.*?广场|.*?小区|.*?园区|)?(?<address>.*)";
        // jiexi(stringMap7, regex);
        jiexi(stringMap7, regex1);
        jiexi(stringMap, regex);
        // jiexi(stringMap, regex1);
        // jiexi(stringMap4, regex);
        jiexi(stringMap4, regex2);
        jiexi(stringMap5, regex);
        // jiexi(stringMap5, regex1);
        // jiexi(stringMap1, regex);
        jiexi(stringMap1, regex1);
        jiexi(stringMap2, regex);
        // jiexi(stringMap2, regex1);
        // jiexi(stringMap3, regex);
        jiexi1(stringMap3, regex2);
        jiexi(stringMap6, regex);
        jiexi(stringMap8, regex);
        jiexi(stringMap8, regex1);
        jiexi(stringMap9, regex);
        jiexi(stringMap9, regex1);


        // getDistrictCode("辽宁", "大连市", "甘井子区");
    }

    //解析 街道/路/地址
    private static void jiexi(Map<String, String> stringMap, String regex){
        String detailAddress = stringMap.get("county")+stringMap.get("town")+stringMap.get("village");
        // String detailAddress1 = stringMap1.get("village");
        // String regex="(?<street>[^街]+街道|.*?街道)(?<road>[^路]+路|)?(?<address>.*)";
        // String regex="(?<street>[^街]+街道|.*?街|)?(?<streetNum>[^号]+号|)?(?<road>[^路]+路|.*?路|.*?道)(?<roadNum>[^号]+号|)?(?<address>.*)";
        String county=null,town=null,street=null, streetNum=null, road=null,roadNum=null, address=null, location=null;
        Matcher m= Pattern.compile(regex).matcher(detailAddress);
        Map<String,String> row=null;
        while (m.find()) {
            // System.out.println("while^^^^^^^^^");
            row = new LinkedHashMap<String, String>();
            row.put("county", county==null?"":county.trim());
            town=m.group("town");
            row.put("town", town==null?"":town.trim());
            street = m.group("street");
            row.put("street", street == null ? "" : street.trim());
            streetNum = m.group("streetNum");
            row.put("streetNum", streetNum == null ? "" : streetNum.trim());
            road = m.group("road");
            row.put("road", road == null ? "" : road.trim());
            roadNum = m.group("roadNum");
            row.put("roadNum", roadNum == null ? "" : roadNum.trim());
            location = m.group("location");
            row.put("location", location == null ? "" : location.trim());
            address = m.group("address");
            row.put("address", address == null ? "" : address.trim());
            // System.out.println("street ："+street+", streetNum : "+streetNum+", address : "+address);
        }
        System.out.println("详细地址 : "+detailAddress+"\r\n拆解为：" +row);
        System.out.println("………………………………………………………………………………………………");
    }

    //解析 道路/街道/地址
    private static void jiexi1(Map<String, String> stringMap, String regex){
        String detailAddress = stringMap.get("town")+stringMap.get("village");
        // System.out.println("解析的详细地址："+detailAddress);
        // String regex="(?<street>[^街]+街道|.*?街道)(?<road>[^路]+路|)?(?<address>.*)";
        // String regex="(?<road>[^路]+路|.*?路|.*?道)(?<roadNum>[^号]+号|)?(?<street>[^街]+街道|.*?街|)?(?<streetNum>[^号]+号|)?(?<address>.*)";
        Matcher m= Pattern.compile(regex).matcher(detailAddress);
        Map<String,String> row=null;
        String street=null, streetNum=null,location=null, address=null;
        if(m.find()) {
            // System.out.println("while^^^^^^^^^");
            row = new LinkedHashMap<String, String>();
            street = m.group("street");
            row.put("street", street == null ? "" : street.trim());
            streetNum = m.group("streetNum");
            row.put("streetNum", streetNum == null ? "" : streetNum.trim());
            location = m.group("location");
            row.put("location", location == null ? "" : location.trim());
            address = m.group("address");
            row.put("address", address == null ? "" : address.trim());
            // System.out.println("street ："+street+", streetNum : "+streetNum+", address : "+address);
        }
        System.out.println("详细地址 : "+detailAddress+"\r\n拆解为：" +row);
        System.out.println("………………………………………………………………………………………………");
    }

    private static void jiexi(){

    }
}
