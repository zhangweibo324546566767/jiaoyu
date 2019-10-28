package com.roncoo.service;

<<<<<<< HEAD


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
=======
import com.roncoo.education.yunying.common.model.DiscountModel;

import java.util.List;

public interface DiscountService {
    List<DiscountModel> findDiscountList();

    void updateDiscountStatus(Integer id, Integer status);

    DiscountModel findDiscountById(Integer id);

    void deleDiscount(Integer id);
>>>>>>> ddca540109d54dae5d1af9196d09339c06652fcb
}
