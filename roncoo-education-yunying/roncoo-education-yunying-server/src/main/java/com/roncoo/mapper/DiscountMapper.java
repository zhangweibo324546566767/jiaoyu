package com.roncoo.mapper;

<<<<<<< HEAD
import com.roncoo.education.yunying.common.model.Course;
import com.roncoo.education.yunying.common.model.CourseCategory;
import com.roncoo.education.yunying.common.model.Discount;
import com.roncoo.education.yunying.common.model.Seckill;
=======
import com.roncoo.education.yunying.common.model.DiscountModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
>>>>>>> ddca540109d54dae5d1af9196d09339c06652fcb

import java.util.List;

public interface DiscountMapper {

<<<<<<< HEAD
    public List<Discount> findDiscountList();

    void addDiscount(Discount discount);

    List<CourseCategory> findCourseCategory(Integer typeid);

    List<Course> findCourseList(List<Integer> ids);


    List<Seckill> findSeckillList();

    void addSeckill(Seckill seckill);
=======
    @Select("select * from t_discount td left join t_affiliation ta on td.discountId=ta.id")
    List<DiscountModel> findDiscountList();

    @Update("update t_discount set discountStatus=#{status} where discountId=#{id}")
    void updateDiscountStatus(@Param("id") Integer id, @Param("status") Integer status);

    @Select("select * from t_discount where discountId=#{id}")
    DiscountModel findDiscountById(@Param("id") Integer id);

    @Delete("delete from t_discount where discountId=#{id}")
    void deleDiscount(@Param("id") Integer id);
>>>>>>> ddca540109d54dae5d1af9196d09339c06652fcb
}
