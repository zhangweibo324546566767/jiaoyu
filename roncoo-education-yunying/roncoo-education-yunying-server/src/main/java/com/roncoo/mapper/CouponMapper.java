package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.CouponModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CouponMapper {


    @Select("select * from t_coupon tc left join t_affiliation ta on tc.couponAffiliation=ta.id")
    List<CouponModel> couponPage(CouponModel coupon);

    @Select("select * from t_affiliation")
    List<AffiliationModel> findAffiliation();

    @Update("update t_coupon set couponStatus=#{status} where couponId=#{id}")
    void updateCouponStatus(@Param("id") Integer id, @Param("status") Integer status);

    @Delete("delete from t_coupon where couponId=#{id}")
    void deleCoupon(@Param("id") Integer id);

    @Select("select * from t_coupon where couponId=#{id}")
    CouponModel findById(@Param("id") Integer id);

    @Update("update t_coupon set receiveStatus=#{status} where couponId=#{id}")
    void receive(@Param("status") Integer status,@Param("id") Integer id);

    @Update("update t_discount set receiveStatus=#{status} where discountId=#{id}")
    void discount(Integer status,@Param("id") Integer id);
}
