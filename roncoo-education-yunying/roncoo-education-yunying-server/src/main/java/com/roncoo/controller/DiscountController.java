package com.roncoo.controller;


import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;
import com.roncoo.education.yunying.common.service.DiscountApi;
import com.roncoo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class DiscountController implements DiscountApi {

    @Autowired
    private DiscountService discountService;


    public Map findDiscountList(){
        return discountService.findDiscountList();
    }

    @Override
    public void addDiscount(Discount discount) {
        discountService.addDiscount(discount);
    }

    @Override
    public Map findCourseType(Integer courseTypeId,Integer pid) {

        Map courseType = discountService.findCourseType(courseTypeId,pid);
        return courseType;
    }

    @Override
    public List<Course> findCourse(Integer courseId) {

        List<Course> list = discountService.findCourse(courseId);
        return list;
    }

    @Override
    public Map findSeckillList() {

        return discountService.findSeckillList();
    }

    @Override
    public void addSeckill(Seckill seckill) {
        discountService.addSeckill(seckill);
    }


}
