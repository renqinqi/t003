package com.example.service;

import com.example.pojo.User;

public interface UserService {
//    增
    Boolean add(User user);
//    删
    Boolean del(Integer uid);
//    改
    Boolean update(User user);
//    查
    User findById(Integer uid);
}
