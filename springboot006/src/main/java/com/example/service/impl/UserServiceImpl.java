package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
//增
    @Override
    public Boolean add(User user) {
        Integer row = userMapper.add(user);
        return row>0;
    }

//删
    @Override
    public Boolean del(Integer uid) {
        return null;
    }
//改
    @Override
    public Boolean update(User user) {
        return null;
    }
//查
    @Override
    public User findById(Integer uid) {
        return null;
    }
}
