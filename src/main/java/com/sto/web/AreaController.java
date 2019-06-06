/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: AreaController
 * Author:   Administrator
 * Date:     2019-03-25 15:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.web;/**
 * Created by Administrator on 2019-03-25.
 */

import com.sto.entity.BaseOrganizeArea;
import com.sto.entity.Order;
import com.sto.mapper.BaseOrganizeAreaMapper;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import com.sto.mapper.three.StoOrderCallMapper;
import com.sto.mapper.two.BaseOrganizeArea2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-03-25
 * @since 1.0.0
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private BaseOrganizeArea1Mapper area1Mapper;

    @Autowired
    private BaseOrganizeArea2Mapper area2Mapper;

    @RequestMapping("/getAreas")
    public List<BaseOrganizeArea> getAreas() {
        List<BaseOrganizeArea> users=area1Mapper.getAll();
        return users;
    }

    @RequestMapping("/getAreaListBycode")
    public List<BaseOrganizeArea> getAreaListBycode(String code) {
        List<BaseOrganizeArea> users=area1Mapper.getAreaListBycode(code);
        return users;
    }

    @RequestMapping("/getArea")
    public BaseOrganizeArea getById(String id) {
        BaseOrganizeArea area = area1Mapper.selectByPrimaryKey(id);
        return area;
    }

    @GetMapping("/getOrderList")
    public List<BaseOrganizeArea> getOrderList(){
        return area2Mapper.getAll();
    }

    @GetMapping("/getListByCode")
    public List<BaseOrganizeArea> getOrderListByCode(String code){
        List<BaseOrganizeArea> users=area2Mapper.getAreaListBycode(code);
        return users;
    }

     @GetMapping("/getAreaByroad")
    public BaseOrganizeArea getAreaByroad(String road){
         return area2Mapper.getAreaByroad(road);
    }


    @RequestMapping("/saveArea")
    public int saveArea(BaseOrganizeArea area) {
        BaseOrganizeArea area1 = new BaseOrganizeArea();
        area1.setBusinessDistrict("洛阳市");
        area1.setCity("洛阳市");
        area1.setCompanyCode("223316");
        area1.setId(String.valueOf(System.currentTimeMillis()).substring(7));
        area1.setRoadName("龙翔街");
         int insert = area1Mapper.insertSelective(area1);
         return insert;
    }


}
