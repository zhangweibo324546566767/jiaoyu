package com.roncoo.controller;

import com.roncoo.education.yunying.common.model.TeacherTitle;
import com.roncoo.education.yunying.common.model.VipLev;
import com.roncoo.education.yunying.common.service.VipApi;
import com.roncoo.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VipController implements VipApi {

    @Autowired
    private VipService vipService;

    @Override
    public Map findViplevList() {
        return vipService.findViplevList();
    }

    @Override
    public void addVipLev(VipLev vipLev) {
        vipService.addVipLev(vipLev);
    }

    @Override
    public Map findTeacherTitle(Map param) {
        return vipService.findTeacherTitle(param);
    }


    @Override
    public void addTeacherTitle(TeacherTitle teacherTitle) {
        vipService.addTeacherTitle(teacherTitle);
    }
}
