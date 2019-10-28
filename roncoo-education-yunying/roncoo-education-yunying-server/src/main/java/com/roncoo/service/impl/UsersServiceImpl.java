package com.roncoo.service.impl;

import com.roncoo.education.yunying.common.model.UserInfo;
import com.roncoo.mapper.UsersMapper;
import com.roncoo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper userMapper;


    @Override
    public UserInfo findByUsername(Map map) {
        String username = (String) map.get("username");

        return userMapper.findByUsername(username);
    }
}
