package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.TeacherTitle;
import com.roncoo.education.yunying.common.model.VipLev;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

public interface VipApi {

    @RequestMapping("findViplevList")
    Map findViplevList();

    @RequestMapping("addVipLev")
    void addVipLev(@RequestBody VipLev vipLev);

    @RequestMapping("findTeacherTitle")
    Map findTeacherTitle(Map param);

    @RequestMapping("addTeacherTitle")
    void addTeacherTitle(@RequestBody TeacherTitle teacherTitle);
}
