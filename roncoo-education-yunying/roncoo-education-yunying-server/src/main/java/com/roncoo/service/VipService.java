package com.roncoo.service;

import com.roncoo.education.yunying.common.model.TeacherTitle;
import com.roncoo.education.yunying.common.model.VipLev;

import java.util.Map;

public interface VipService {
    Map findViplevList();

    void addVipLev(VipLev vipLev);

    Map findTeacherTitle(Map param);

    void addTeacherTitle(TeacherTitle teacherTitle);
}
