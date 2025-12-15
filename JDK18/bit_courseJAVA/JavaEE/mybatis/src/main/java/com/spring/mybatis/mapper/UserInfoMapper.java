package com.spring.mybatis.mapper;

import com.spring.mybatis.model.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserInfoMapper {
    @Select("select * from user_info")
    List<UserInfo> selectAll();

    @Select("select * from User_info where id=#{id}")
    UserInfo selectById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user_info(username, password, age) values(#{username}, #{password}, #{age})")
    Integer insertUser(UserInfo userInfo);

    @Delete("delete from user_info where id=#{id}")
    Integer deleteUser(int id);

    @Update("update user_info set delete_flag =#{delete_flag},phone=#{phone} where id=#{id}")
    Integer updateUser(int id, int delete_flag, String phone);
}
