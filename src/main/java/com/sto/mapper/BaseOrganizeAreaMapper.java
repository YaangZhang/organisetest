package com.sto.mapper;

import java.util.List;

import com.sto.entity.BaseOrganizeArea;
import com.sto.param.AreaParam;

public interface BaseOrganizeAreaMapper {

    List<BaseOrganizeArea> getAll();

    List<BaseOrganizeArea> getAreaListBycode(String code);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizeArea record);

    int insertSelective(BaseOrganizeArea record);

    BaseOrganizeArea selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseOrganizeArea record);

    int updateByPrimaryKey(BaseOrganizeArea record);

    List<BaseOrganizeArea> getListByPage(AreaParam areaParam);

    int getCount(AreaParam areaParam);
}