package com.sto.mapper.one;

import com.sto.entity.BaseUserExpressEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserExpressMapper {

    @Select("SELECT * FROM base_user_express WHERE web_enabled = 1 AND network_orders = 1 AND is_receive = 1 AND company_id = #{id}")
    public List<BaseUserExpressEntity> getByCompanyId(String id);

    @Select({
            "<script>",
            "SELECT" +
            " * FROM base_user_express " +
            "WHERE web_enabled = 1 " +
            "AND network_orders = 1 " +
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
