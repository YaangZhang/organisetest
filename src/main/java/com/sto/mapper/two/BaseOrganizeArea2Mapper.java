package com.sto.mapper.two;

import com.sto.entity.BaseArea;
import com.sto.entity.BaseOrganizeArea;
import com.sto.param.AreaParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BaseOrganizeArea2Mapper {

    List<BaseOrganizeArea> getAll();

    List<BaseOrganizeArea> getAreaListBycode(String code);

    BaseOrganizeArea getAreaByroad(String road);

    List<Map<String, String>> getRoadByProCity(@Param("pro")String pro, @Param("city")String city);

    @Select("SELECT COMPANY_CODE FROM base_organize_area WHERE ID = #{ID}")
    String getCompanyCodeById(String id);

    int deleteByPrimaryKey(String id);

    int insert(BaseArea record);

    int insertSelective(BaseOrganizeArea record);

    BaseOrganizeArea selectByPrimaryKey(String id);

//    int updateByPrimaryKeySelective(BaseOrganizeArea record);

    int updateByPrimaryKey(BaseOrganizeArea record);

    List<BaseOrganizeArea> getListByPage(AreaParam areaParam);

    int getCount(AreaParam areaParam);
}