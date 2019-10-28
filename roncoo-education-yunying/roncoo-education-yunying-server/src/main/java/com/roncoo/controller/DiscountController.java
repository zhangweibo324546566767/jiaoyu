package com.roncoo.controller;

<<<<<<< HEAD

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
=======
import com.roncoo.education.yunying.common.model.DiscountModel;
import com.roncoo.education.yunying.common.service.DiscountServiceApi;
import com.roncoo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController implements DiscountServiceApi {
>>>>>>> ddca540109d54dae5d1af9196d09339c06652fcb

    @Autowired
    private DiscountService discountService;


<<<<<<< HEAD
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


=======
    @Override
    public List<DiscountModel> findDiscountList() {
        return discountService.findDiscountList();
    }

    @Override
    public void updateDiscountStatus(@RequestParam Integer id, @RequestParam Integer status) {
        discountService.updateDiscountStatus(id, status);
    }

    @Override
    public DiscountModel findDiscountById(@RequestParam Integer id) {
        return discountService.findDiscountById(id);
    }

    @Override
    public void deleDiscount(@RequestParam Integer id) {
        discountService.deleDiscount(id);
    }

>>>>>>> ddca540109d54dae5d1af9196d09339c06652fcb
}
