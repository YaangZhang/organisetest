/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: OrderController
 * Author:   Administrator
 * Date:     2019-03-28 15:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.web;/**
 * Created by Administrator on 2019-03-28.
 */

import com.sto.entity.Order;
import com.sto.mapper.one.OrderMapper;
import com.sto.mapper.three.StoOrderCallMapper;
import com.sto.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-03-28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private StoOrderCallMapper orderCallMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderById/{id}")
    public Order getOrderByOrderId(@PathVariable("id") String id) {
        Order order = orderCallMapper.getOrderByOrderId(id);
        System.out.println("订单ID = "+id+ "获取的订单 = "+order);
        return order;
    }

    @RequestMapping("/getAll")
    public List<Order> getAll() {
        List<Order> orderList = orderCallMapper.getAll();
        return orderList;
    }

    @RequestMapping("/save")
    public int save(Order order) {
        int num = orderMapper.insertSelective(order);
        return num;
    }

    @RequestMapping("/getById/{id}")
    public Order getByOrderId(@PathVariable("id") String id) {
        Order order = orderMapper.getOrderByOrderId(id);
        System.out.println("订单ID = "+id+ "获取的订单 = "+order);
        return order;
    }

    @RequestMapping("/getlistByDate")
    public List<Order> getlistByDate( String beginDate, String endDate) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("beginTime",beginDate );
        map.put("endTime",endDate);
        System.out.println("map = "+map);
        List<Order> orders = orderCallMapper.getListByDate(map);
        orders.forEach(order -> {
            orderMapper.insertSelective(order);
        });
        System.out.println("getlistByDate = "+orders);
        return orders;
    }

    @RequestMapping("/getByCity")
    public List<Order> getByCity(String city) {
        List<Order> orders = orderCallMapper.getByCity(city);
        orders.forEach(order -> {
            orderMapper.insertSelective(order);
        });
        System.out.println("getlistByDate = "+orders);
        return orders;
    }

    @RequestMapping("/getListByCity")
    public List<Order> getListByCity(String city, String beginDate, String endDate) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("city",city );
        map.put("beginTime",beginDate );
        map.put("endTime",endDate);
        System.out.println("map = "+map);
        List<Order> orders = orderCallMapper.getListByCity(map);
        orders.forEach(order -> {
            orderMapper.insertSelective(order);
        });
        System.out.println("getlistByDate = "+orders);
        return orders;
    }

    @RequestMapping("/dispatch")
    public void dispatch(){
        // Order order = orderCallMapper.getOrderByOrderId("ST18141150149284");
        // String siteCode = orderService.dispatch(order);
        int c = 0, j = 0;
        for (int i = 21; i <41 ;i ++ ) {
            List<Order> orderList = orderService.getOrderByPage(i, 100);
            for (Order order : orderList) {
                j += 1;
                String siteCode = orderService.dispatch(order);
                // logger.info(j + "==寄件地址 ："+order.getSendAddress()+",  companyCode : "+siteCode);
                if (siteCode != null && siteCode.equals(order.getAssignSiteCode())) {
                    c +=1;
                    // System.out.println(c + "==订单 "+order.getOrderId()+"("+order.getAssignSiteCode() +")"+" 分单到 "+siteCode+" 成功");
                    // System.out.println("…………………………………………………………………………………………………………");
                    logger.info(c + "==订单 "+order.getOrderId()+"("+order.getAssignSiteCode() +")"+" 分单到 "+siteCode+" 成功");
                }
            }
        }
    }


}
