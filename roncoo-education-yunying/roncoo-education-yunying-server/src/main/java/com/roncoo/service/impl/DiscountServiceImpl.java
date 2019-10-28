package com.roncoo.service.impl;


import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;
import com.roncoo.mapper.DiscountMapper;
import com.roncoo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountMapper discountMapper;
    @Override
    public Map findDiscountList() {
        Map map = new HashMap();
        map.put("discountList",discountMapper.findDiscountList());
        return map;
    }

    @Override
    public void addDiscount(Discount discount) {


        discount.setCreateTime(new Date());
        discountMapper.addDiscount(discount);
    }

    @Override
    public Map findCourseType(Integer courseTypeId,Integer pid) {
        Map map = new HashMap();
        switch(courseTypeId) {
            case 1:
                
                List<CourseCategory> list = discountMapper.findCourseCategory(pid);
                map.put("courseCategoryList",list);
                return map;
            case 2:

                break;
            default:

        }

        return null;
    }

    @Override
    public List<Course> findCourse(Integer courseId) {
        List<Course> list = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        
        if(courseId != null){
            List<CourseCategory> courseCategoryByPid = findCourseCategoryByPid(courseId);
            for (CourseCategory course : courseCategoryByPid) {
                if(course.getChildren() != null){
                    for (CourseCategory child : course.getChildren()) {
                        ids.add(child.getId());
                    }
                }
                ids.add(course.getId());
            }
            ids.add(courseId);
            list = discountMapper.findCourseList(ids);
        }

        return list;
    }

    @Override
    public Map findSeckillList() {
        Map map = new HashMap();
        List<Seckill> seckillList = discountMapper.findSeckillList();
        map.put("seckillList",seckillList);
        return map;
    }

    @Override
    public void addSeckill(Seckill seckill) {
        seckill.setCreateTime(new Date());
        discountMapper.addSeckill(seckill);
    }

    private List<CourseCategory> findCourseCategoryByPid(Integer id) {
        List<CourseCategory> list = discountMapper.findCourseCategory(id);
        for (CourseCategory course : list) {
            Integer cid = course.getId();
            List<CourseCategory> courseCategoryByPid = findCourseCategoryByPid(cid);
            course.setChildren(courseCategoryByPid);
        }

        return list;
    }
}
