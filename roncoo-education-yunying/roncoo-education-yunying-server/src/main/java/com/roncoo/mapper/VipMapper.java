package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.TeacherTitle;
import com.roncoo.education.yunying.common.model.VipLev;

import java.util.List;
import java.util.Map;

public interface VipMapper {


    List<VipLev> findViplevList();

    void addVipLev(VipLev vipLev);

    List<TeacherTitle> findTeacherTitle(Map param);

    void addTeacherTitle(TeacherTitle teacherTitle);
}
