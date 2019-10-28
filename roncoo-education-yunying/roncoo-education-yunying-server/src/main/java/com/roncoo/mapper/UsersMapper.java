package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.UserInfo;

public interface UsersMapper {


    UserInfo findByUsername(String username);
}
