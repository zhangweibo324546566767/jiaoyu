package com.roncoo.interfaces;


import com.roncoo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface UserServiceApi {

    /**
     * 用户列表查询
     * @param user
     * @return
     */
    @RequestMapping("/userList")
    public List<User> userList(User user);
}
