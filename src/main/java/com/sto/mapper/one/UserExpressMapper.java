package com.sto.mapper.one;

import com.sto.entity.BaseUserExpressEntity;
import com.sto.entity.EmployeeScope;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserExpressMapper {

    @Select("SELECT u.id id,u.receive_area receiveArea,u.disp_area dispArea FROM base_user_express u WHERE web_enabled = 1 AND network_orders = 1 AND is_receive = 1 AND company_id = #{id}")
    public List<EmployeeScope> getByCompanyId(String id);

    @Select({"<script>",
            "SELECT e.id id,e.receive_area receiveArea,e.disp_area dispArea,u.code code, u.real_name realName, u.nickname nickName " +
            "FROM base_user_express e" +
            " join BASE_USER u on e.ID=u.ID " +
            "WHERE e.company_id = #{id}  AND e.network_orders = 1 AND e.is_receive = 1" +
            "<if test='key != null'>"+
            "and e.receive_area = #{key}"+
            "</if>",
            "</script>"})//AND e.web_enabled = 1
    public List<EmployeeScope> getUserByCompanyId(@Param("id")String id, @Param("key")String searchKey);


    @Select({
            "<script>",
            "SELECT" +
            " * FROM base_user_express " +
            "WHERE " +
                  /*  "web_enabled = 1 AND" +*/
            " network_orders = 1 " +
            "AND is_receive = 1 " +
            "<if test='key != null'>"+
            "and receive_area = #{key}"+
            "</if>"+
            "AND id in ",
            "<foreach collection='ids' item='item' open='(' separator=',' close=')'>",
            "#{item}",
            "</foreach>",
            "</script>"
    })
    public List<BaseUserExpressEntity> getListById(@Param("ids") List<String> ids, @Param("key")String searchKey);


}
