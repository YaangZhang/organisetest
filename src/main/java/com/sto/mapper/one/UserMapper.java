package com.sto.mapper.one;

import com.sto.entity.BaseUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM BASE_USER")
    @Results({
            @Result(column = "user_name", property = "userName"),
            @Result(column = "real_name", property = "realName"),
            @Result(column = "quick_query", property = "quickQuery"),
            @Result(column = "simple_spelling", property = "simpleSpelling"),
            @Result(column = "company_id", property = "companyId"),
            @Result(column = "company_code", property = "companyCode"),
            @Result(column = "company_name", property = "companyName"),
            @Result(column = "department_id", property = "departmentId"),
            @Result(column = "department_code", property = "departmentCode"),
            @Result(column = "department_name", property = "departmentName"),
            @Result(column = "subCompany_id", property = "subCompanyId"),
            @Result(column = "subCompany_name", property = "subCompanyName"),
            @Result(column = "province_id", property = "provinceId"),
            @Result(column = "city_id", property = "cityId"),
            @Result(column = "district_id", property = "districtId"),
            @Result(column = "home_address", property = "homeAddress"),
            @Result(column = "is_administrator", property = "isAdministrator"),
            @Result(column = "security_level", property = "securityLevel"),
            @Result(column = "user_from", property = "userFrom"),
            @Result(column = "sort_code", property = "sortCode"),
            @Result(column = "is_itaff", property = "isStaff"),
            @Result(column = "is_visible", property = "isVisible"),
            @Result(column = "deletion_state_code", property = "deletionStateCode"),
            @Result(column = "create_on", property = "createOn"),
            @Result(column = "create_user_id", property = "createUserId"),
    })
    public List<BaseUser> getUserAll();

     @Select("SELECT * FROM BASE_USER WHERE COMPANY_ID = #{companyId}")
     @Results({
             @Result(column = "user_name", property = "userName"),
             @Result(column = "real_name", property = "realName"),
             @Result(column = "quick_query", property = "quickQuery"),
             @Result(column = "simple_spelling", property = "simpleSpelling"),
             @Result(column = "company_id", property = "companyId"),
             @Result(column = "company_code", property = "companyCode"),
             @Result(column = "company_name", property = "companyName"),
             @Result(column = "department_id", property = "departmentId"),
             @Result(column = "department_code", property = "departmentCode"),
             @Result(column = "department_name", property = "departmentName"),
             @Result(column = "subCompany_id", property = "subCompanyId"),
             @Result(column = "subCompany_name", property = "subCompanyName"),
             @Result(column = "province_id", property = "provinceId"),
             @Result(column = "city_id", property = "cityId"),
             @Result(column = "district_id", property = "districtId"),
             @Result(column = "home_address", property = "homeAddress"),
             @Result(column = "is_administrator", property = "isAdministrator"),
             @Result(column = "security_level", property = "securityLevel"),
             @Result(column = "user_from", property = "userFrom"),
             @Result(column = "sort_code", property = "sortCode"),
             @Result(column = "is_itaff", property = "isStaff"),
             @Result(column = "is_visible", property = "isVisible"),
             @Result(column = "deletion_state_code", property = "deletionStateCode"),
             @Result(column = "create_on", property = "createOn"),
             @Result(column = "create_user_id", property = "createUserId"),
     })
    public List<BaseUser> getByCompanyId(String companyId);

    @Select("SELECT * FROM BASE_USER WHERE PROVINCE = #{province}")
    @Results({
            @Result(column = "user_name", property = "userName"),
            @Result(column = "real_name", property = "realName"),
            @Result(column = "quick_query", property = "quickQuery"),
            @Result(column = "simple_spelling", property = "simpleSpelling"),
            @Result(column = "company_id", property = "companyId"),
            @Result(column = "company_code", property = "companyCode"),
            @Result(column = "company_name", property = "companyName"),
            @Result(column = "department_id", property = "departmentId"),
            @Result(column = "department_code", property = "departmentCode"),
            @Result(column = "department_name", property = "departmentName"),
            @Result(column = "subCompany_id", property = "subCompanyId"),
            @Result(column = "subCompany_name", property = "subCompanyName"),
            @Result(column = "province_id", property = "provinceId"),
            @Result(column = "city_id", property = "cityId"),
            @Result(column = "district_id", property = "districtId"),
            @Result(column = "home_address", property = "homeAddress"),
            @Result(column = "is_administrator", property = "isAdministrator"),
            @Result(column = "security_level", property = "securityLevel"),
            @Result(column = "user_from", property = "userFrom"),
            @Result(column = "sort_code", property = "sortCode"),
            @Result(column = "is_itaff", property = "isStaff"),
            @Result(column = "is_visible", property = "isVisible"),
            @Result(column = "deletion_state_code", property = "deletionStateCode"),
            @Result(column = "create_on", property = "createOn"),
            @Result(column = "create_user_id", property = "createUserId"),
    })
    public List<BaseUser> getByProv(String province);


}
