package com.roncoo.service;



import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;

import java.util.List;
import java.util.Map;



public interface DiscountService {

    public Map findDiscountList();

    void addDiscount(Discount discount);

    Map findCourseType(Integer courseTypeId, Integer pid);

    List<Course> findCourse(Integer courseId);

    Map findSeckillList();

    void addSeckill(Seckill seckill);
}
