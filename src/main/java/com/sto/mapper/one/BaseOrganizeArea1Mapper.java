package com.sto.mapper.one;

import com.sto.entity.BaseOrganizeArea;
import com.sto.param.AreaParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BaseOrganizeArea1Mapper {

    List<BaseOrganizeArea> getAll();

    List<BaseOrganizeArea> getAreaListBycode(String code);

    List<Map<String, String>> getRoadByProCity(@Param("pro")String pro, @Param("city")String city);

    @Select("SELECT COMPANY_CODE FROM base_organize_area WHERE ID = #{ID}")
    String getCompanyCodeById(String id);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizeArea record);

    int insertSelective(BaseOrganizeArea record);

    BaseOrganizeArea selectByPrimaryKey(String id);

    int updateByPrimaryKey(BaseOrganizeArea record);

    List<BaseOrganizeArea> getListByPage(AreaParam areaParam);

    int getCount(AreaParam areaParam);
}