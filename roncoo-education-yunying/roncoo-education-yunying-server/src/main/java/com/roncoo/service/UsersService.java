package com.roncoo.service;

import com.roncoo.education.yunying.common.model.UserInfo;

import java.util.Map;

public interface UsersService {



    UserInfo findByUsername(Map map);
}
