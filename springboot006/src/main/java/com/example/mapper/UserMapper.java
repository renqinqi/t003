package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
//    增
    Integer add(@Param(value = "user") User user);
//    删
    Integer del(Integer uid);
//    改
    Integer update(@Param(value = "user2") User user);
//    查
    User findById(Integer uid);
}
