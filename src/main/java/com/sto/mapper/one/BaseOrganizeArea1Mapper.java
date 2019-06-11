package com.sto.mapper.one;

import com.sto.entity.BaseOrganizeArea;
import com.sto.entity.BaseOrganizeEntity;
import com.sto.entity.BaseUserExpressEntity;
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

    /**
     *
     * @mbggenerated
     */
    int deleteById(String id);
    int deleteAll();

    /**
     *
     * @mbggenerated
     */
    int insertExpress(BaseUserExpressEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertExpressSelective(BaseUserExpressEntity record);

    /**
     *
     * @mbggenerated
     */
    BaseUserExpressEntity selectById(String id);

    /**
     *
     * @mbggenerated
     */
    int updateExpressSelective(BaseUserExpressEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateExpress(BaseUserExpressEntity record);

    /* base_organize */
    int deleteOrganizeById(String id);

    /**
     *
     * @mbggenerated
     */
    int insertOrganize(BaseOrganizeEntity record);

    /**
     *
     * @mbggenerated
     */
    int insertOrganizeSelective(BaseOrganizeEntity record);

    /**
     *
     * @mbggenerated
     */
    BaseOrganizeEntity selectOrganizeById(String id);

    /**
     *
     * @mbggenerated
     */
    int updateOrganizeSelective(BaseOrganizeEntity record);

    /**
     *
     * @mbggenerated
     */
    int updateOrganize(BaseOrganizeEntity record);
}