package com.roncoo.service;

import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.CouponModel;
import com.roncoo.education.yunying.common.model.PageModel;

import java.util.List;

public interface CouponService {

    List<CouponModel> couponPage(CouponModel coupon);

    List<AffiliationModel> findAffiliation();

    void updateCouponStatus(Integer id, Integer status);

    void deleCoupon(Integer id);

    CouponModel findById(Integer id);

    void receive(Integer status,Integer id);

    void discount(Integer status,Integer id);
}
