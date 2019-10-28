package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.DiscountModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DiscountMapper {

    @Select("select * from t_discount td left join t_affiliation ta on td.discountId=ta.id")
    List<DiscountModel> findDiscountList();

    @Update("update t_discount set discountStatus=#{status} where discountId=#{id}")
    void updateDiscountStatus(@Param("id") Integer id, @Param("status") Integer status);

    @Select("select * from t_discount where discountId=#{id}")
    DiscountModel findDiscountById(@Param("id") Integer id);

    @Delete("delete from t_discount where discountId=#{id}")
    void deleDiscount(@Param("id") Integer id);
}
