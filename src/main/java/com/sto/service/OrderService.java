/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: OrderService
 * Author:   Administrator
 * Date:     2019-04-17 11:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.service;/**
 * Created by Administrator on 2019-04-17.
 */

import com.sto.entity.Order;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-04-17
 * @since 1.0.0
 */
public interface OrderService {
     public void zhuanyiOrder();

    /**
     * 订单调度
     * @param order
     */
    public String dispatch(Order  order);

    /**
     * 分页查询
     * @param currPage
     * @param pageSize
     * @return
     */
    List<Order> getOrderByPage(int currPage, int pageSize);
}
