package com.roncoo.service.impl;


import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.CouponModel;
import com.roncoo.education.yunying.common.model.PageModel;
import com.roncoo.mapper.CouponMapper;
import com.roncoo.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponMapper;


    @Override
    public List<CouponModel> couponPage(CouponModel coupon) {

        return couponMapper.couponPage(coupon);
    }

    @Override
    public List<AffiliationModel> findAffiliation() {
        return couponMapper.findAffiliation();
    }

    @Override
    public void updateCouponStatus(Integer id, Integer status) {
        couponMapper.updateCouponStatus(id, status);
    }

    @Override
    public void deleCoupon(Integer id) {
        couponMapper.deleCoupon(id);
    }

    @Override
    public CouponModel findById(Integer id) {
        return couponMapper.findById(id);
    }

    @Override
    public void receive(Integer status,Integer id) {
        couponMapper.receive(status,id);
    }

    @Override
    public void discount(Integer status,Integer id) {
        couponMapper.discount(status,id);
    }
}
