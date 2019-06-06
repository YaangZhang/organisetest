/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: OrderServiceImpl
 * Author:   Administrator
 * Date:     2019-04-17 13:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.service;/**
 * Created by Administrator on 2019-04-17.
 */

import com.sto.entity.Order;
import com.sto.mapper.BaseOrganizeAreaMapper;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import com.sto.mapper.one.OrderMapper;
import com.sto.mapper.three.StoOrderCallMapper;
import com.sto.mapper.two.BaseOrganizeArea2Mapper;
import com.sto.util.AddressResolutionUtil;
import com.sto.vo.Road;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-04-17
 * @since 1.0.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private StoOrderCallMapper orderCallMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private BaseOrganizeArea1Mapper area1Mapper;

    @Autowired
    private BaseOrganizeArea2Mapper area2Mapper;

    @Override
    public void zhuanyiOrder() {


    }

    @Override
    public List<Order> getOrderByPage(int currPage, int pageSize) {
        Map<String, Object> data = new HashMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        return orderMapper.getByPage(data);
    }

    /**
     * 订单调度
     * @param order
     */
    @Override
    public String dispatch(Order order) {
        String sendAddress = order.getSendAddress();
        String pro = getPro(order.getSendProv());
        // List<Map<String, String>> roadList = area1Mapper.getRoadByProCity(pro, order.getSendCity());
        List<Map<String, String>> roadList = area2Mapper.getRoadByProCity(order.getSendProv(), order.getSendCity());
        String roadId = null;
        if (roadList.size() > 0) {
            for (Map<String, String> roadName : roadList) {
                String road = roadName.get("roadName").trim();
                // String[] splits = road.trim().split(" ");龙岗园  中城公园里 铁路小区 西南路331检察院 西南路333号警察局 宅语园 园中园  泰安花园  台四小区
                //按空格切割，可以切割单个、多个空格和制表符
                String[] splits = road.split("\\s+");
                if (splits.length > 1) {
                    for (String r : splits) {
                        r = r.trim();
                        if (sendAddress.contains(r)) {
                            // System.out.println(roadName);
                            roadId = roadName.get("id");
                            // String companyCode = area1Mapper.getCompanyCodeById(roadId);
                            String companyCode = area2Mapper.getCompanyCodeById(roadId);
                            // System.out.println("roadId : " +roadId+", companyCode : "+companyCode);
                            logger.info("寄件地址 ："+order.getSendProv()+order.getSendCity()+order.getSendArea()+sendAddress+", roadName : " +road+", roadId : " +roadId+", companyCode : "+companyCode);
                            return companyCode;
                        }
                    }
                }else {
                    if (sendAddress.contains(roadName.get("roadName"))) {
                        roadId = roadName.get("id");
                        String companyCode = area2Mapper.getCompanyCodeById(roadId);
                        // System.out.println("roadId : " +roadId+", companyCode : "+companyCode);
                        logger.info("寄件地址 ："+order.getSendProv()+"-"+order.getSendCity()+"-"+order.getSendArea()+"-"+sendAddress+", roadName : " +road+", roadId : " +roadId+", companyCode : "+companyCode);
                        return companyCode;
                    }
                }
            }
        }
        else {
            System.out.println("没有匹配的数据");
        }
        return null;
        // return getSiteCode(roads, sendAddress);
    }

    private String getPro(String pro) {
        // pro = pro.replace("\\省|市|自治区|特别行政区|壮族|回族|维吾尔\\g", "");
        if (pro.contains("自治区") || pro.contains("特别行政区")) {
            pro = pro.substring(0, 3);
            if (pro.contains("内蒙")) {
               return pro;
            } else {
                pro = pro.substring(0, 2);
                return pro;
            }
        }else {
            pro = pro.substring(0, pro.length() - 1);
        }
        return pro;
    }

    private String getSiteCode(List<Map<String, String>> roadList, String sendAddress){
        String roadId = null;
        if (roadList.size() > 0) {
            for (Map<String, String> roadName : roadList) {
                String road = roadName.get("roadName").trim();
                // String[] splits = road.trim().split(" ");龙岗园  中城公园里 铁路小区 西南路331检察院 西南路333号警察局 宅语园 园中园  泰安花园  台四小区
                //按空格切割，可以切割单个、多个空格和制表符
                String[] splits = road.split("\\s+");
                if (splits.length > 1) {
                    for (String r : splits) {
                        r = r.trim();
                        if (sendAddress.contains(r)) {
                            // System.out.println(roadName);
                            roadId = roadName.get("id");
                            // String companyCode = area1Mapper.getCompanyCodeById(roadId);
                            String companyCode = area2Mapper.getCompanyCodeById(roadId);
                            // System.out.println("roadId : " +roadId+", companyCode : "+companyCode);
                            logger.info("==寄件地址 ："+sendAddress+", roadId : " +roadId+", companyCode : "+companyCode);
                            return companyCode;
                        }
                    }
                }else {
                    if (sendAddress.contains(roadName.get("roadName"))) {
                        roadId = roadName.get("id");
                        String companyCode = area2Mapper.getCompanyCodeById(roadId);
                        // System.out.println("roadId : " +roadId+", companyCode : "+companyCode);
                        logger.info("寄件地址 ："+sendAddress+", roadId : " +roadId+", roadName : " +road+", companyCode : "+companyCode);
                        return companyCode;
                    }
                }
            }
        }
        else {
            System.out.println("没有匹配的数据");
        }
        return null;
    }


}
