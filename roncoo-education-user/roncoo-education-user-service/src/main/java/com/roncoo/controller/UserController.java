package com.roncoo.controller;


import com.roncoo.interfaces.UserServiceApi;
import com.roncoo.model.User;
import com.roncoo.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserServiceApi {

    @Autowired
    private UserSerivce userSerivce;



    @Override
    public List<User> userList(User user) {
        return userSerivce.userList(user);
    }


}
