package com.roncoo.controller;


import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.CouponModel;
import com.roncoo.education.yunying.common.model.PageModel;
import com.roncoo.education.yunying.common.service.CouponServiceApi;
import com.roncoo.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponController implements CouponServiceApi {

    @Autowired
    private CouponService couponService;

    @Override
    public List<CouponModel> couponPage(CouponModel coupon) {
        return couponService.couponPage(coupon);
    }

    @Override
    public List<AffiliationModel> findAffiliation() {
        return couponService.findAffiliation();
    }

    @Override
    public void updateCouponStatus(@RequestParam Integer id, @RequestParam Integer status) {
        couponService.updateCouponStatus(id, status);
    }

    @Override
    public void deleCoupon(@RequestParam Integer id) {
        couponService.deleCoupon(id);
    }

    @Override
    public CouponModel findById(@RequestParam Integer id) {
        return couponService.findById(id);
    }

    @Override
    public void receive(Integer status,Integer id) {
        couponService.receive(status,id);
    }

    @Override
    public void discount(Integer status,Integer id) {
        couponService.discount(status,id);
    }
}
