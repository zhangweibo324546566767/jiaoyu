package com.roncoo.service;



import com.roncoo.model.User;

import java.util.List;

public interface UserSerivce {
    /**
     * 用户列表信息
     * @param user
     * @return
     */
    public List<User> userList(User user);
}
