package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.CouponModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CouponServiceApi {

    @RequestMapping("couponPage")
    List<CouponModel> couponPage(CouponModel coupon);

    @RequestMapping("findAffiliation")
    List<AffiliationModel> findAffiliation();

    @RequestMapping("updateCouponStatus")
    void updateCouponStatus(@RequestParam Integer id, @RequestParam Integer status);

    @RequestMapping("deleCoupon")
    void deleCoupon(@RequestParam Integer id);

    @RequestMapping("findById")
    CouponModel findById(@RequestParam Integer id);

    @RequestMapping("receive")
    void receive(@RequestParam Integer status,@RequestParam Integer id);

    @RequestMapping("discount")
    void discount(@RequestParam Integer status,@RequestParam Integer id);
}
