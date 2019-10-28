package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface UsersServiceApi {

    @RequestMapping("findByUsername")
    UserInfo findByUsername(@RequestBody Map map);
}
