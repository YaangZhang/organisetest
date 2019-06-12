package com.sto.mapper.three;

import com.sto.entity.Order;

import java.util.HashMap;
import java.util.List;

public interface StoOrderCallMapper {


    int deleteByPrimaryKey(String id);

//    int insert(Order record);
    int insertSelective(Order record);

    Order selectByPrimaryKey(String id);

    Order getOrderByOrderId(String orderId);

    List<Order> getAll();

    List<Order> getListByDate(HashMap map);

    List<Order> getByCity(String city);

    List<Order> getListByCity(HashMap map);

    List<Order> getListByProv(HashMap map);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);


}