package com.sto.mapper.one;

import com.sto.entity.BaseUserExpressEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserExpressMapper {

    @Select("SELECT * FROM base_user_express WHERE id = #{id}")
    public List<BaseUserExpressEntity> getByCompanyId(String id);
}
