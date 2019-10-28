package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;

import java.util.List;

public interface DiscountMapper {

    public List<Discount> findDiscountList();

    void addDiscount(Discount discount);

    List<CourseCategory> findCourseCategory(Integer typeid);

    List<Course> findCourseList(List<Integer> ids);


    List<Seckill> findSeckillList();

    void addSeckill(Seckill seckill);
}
