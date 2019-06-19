package com.sto.mapper.one;

import com.sto.entity.BaseUserExpressEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM BASE_USER")
    public List<BaseUserExpressEntity> getUserAll();

     @Select("SELECT * FROM BASE_USER WHERE COMPANY_ID = #{companyId}")
    public List<BaseUserExpressEntity> getByCompanyId(String companyId);

    @Select("SELECT * FROM BASE_USER WHERE PROVINCE = #{province}")
    public List<BaseUserExpressEntity> getByProv(String province);


}
