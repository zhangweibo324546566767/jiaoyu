package com.roncoo.controller;

import com.roncoo.education.yunying.common.model.UserInfo;
import com.roncoo.education.yunying.common.service.UsersServiceApi;
import com.roncoo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("user")
public class UsersController implements UsersServiceApi {

    @Autowired
    private UsersService usersService;


    @Override
    public UserInfo findByUsername(Map map) {
        return usersService.findByUsername(map);
    }
}
