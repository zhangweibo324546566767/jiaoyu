package com.roncoo.service.impl;

import com.roncoo.education.yunying.common.model.TeacherTitle;
import com.roncoo.education.yunying.common.model.VipLev;
import com.roncoo.mapper.VipMapper;
import com.roncoo.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VipServiceImpl implements VipService {


    @Autowired
    private VipMapper vipMapper;

    @Override
    public Map findViplevList() {
        Map map = new HashMap();

        List<VipLev> list = vipMapper.findViplevList();
        map.put("vipLevList",list);
        return map;
    }

    @Override
    public void addVipLev(VipLev vipLev) {
        vipLev.setStatus(0);
        vipMapper.addVipLev(vipLev);
    }

    @Override
    public Map findTeacherTitle(Map param) {
        Map map = new HashMap();
        List<TeacherTitle> list = vipMapper.findTeacherTitle(param);
        map.put("TeacherTitleList",list);
        return map;
    }



    @Override
    public void addTeacherTitle(TeacherTitle teacherTitle) {

        teacherTitle.setStatus(0);
        vipMapper.addTeacherTitle(teacherTitle);
    }
}
