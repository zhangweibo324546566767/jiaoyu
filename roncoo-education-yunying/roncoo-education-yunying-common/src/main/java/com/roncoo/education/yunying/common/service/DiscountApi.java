package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface DiscountApi {

    @RequestMapping("/findDiscountList")
    public Map findDiscountList();

    @RequestMapping("/addDiscount")
    void addDiscount(@RequestBody Discount discount);


    @RequestMapping("/findCourseType")
    Map findCourseType(@RequestParam("courseTypeId") Integer courseTypeId, @RequestParam("pid") Integer pid);

    @RequestMapping("/findCourse")
    List<Course> findCourse(@RequestParam("courseId") Integer courseId);

    @RequestMapping("/findSeckillList")
    Map findSeckillList();

    @RequestMapping("/addSeckill")
    void addSeckill(@RequestBody Seckill seckill);
}
