/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: OrderMapper
 * Author:   Administrator
 * Date:     2019-03-28 15:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.mapper.one;/**
 * Created by Administrator on 2019-03-28.
 */

import com.sto.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-03-28
 * @since 1.0.0
 */
public interface OrderMapper {

    int deleteByPrimaryKey(String id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String id);

    Order getOrderByOrderId(String orderId);

    List<Order> getAll();

    // List<Order> getByPage(@Param("currIndex")int currIndex, @Param("pageSize")int pageSize);
    List<Order> getByPage(Map<String,Object> data);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
