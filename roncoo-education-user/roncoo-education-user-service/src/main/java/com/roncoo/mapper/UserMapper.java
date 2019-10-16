package com.roncoo.mapper;



import com.roncoo.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    List<User> userList(User user);
}