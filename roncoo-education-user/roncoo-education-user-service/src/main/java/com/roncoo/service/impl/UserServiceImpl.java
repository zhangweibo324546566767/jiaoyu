package com.roncoo.service.impl;


import com.roncoo.mapper.UserMapper;
import com.roncoo.model.User;
import com.roncoo.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList(User user) {
        return userMapper.userList(user);
    }
}
