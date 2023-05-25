package com.lenjoy.forum.dao;

import com.lenjoy.forum.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectById(Long adminUserId);

    int updateByIdSelective(AdminUser record);

    int updateById(AdminUser record);
}
