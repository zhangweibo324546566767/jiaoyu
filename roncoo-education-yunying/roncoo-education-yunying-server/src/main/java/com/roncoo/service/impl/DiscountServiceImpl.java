package com.roncoo.service.impl;

import com.roncoo.education.yunying.common.model.DiscountModel;
import com.roncoo.mapper.DiscountMapper;
import com.roncoo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountMapper discountMapper;

    @Override
    public List<DiscountModel> findDiscountList() {
        return discountMapper.findDiscountList();
    }

    @Override
    public void updateDiscountStatus(Integer id, Integer status) {
        discountMapper.updateDiscountStatus(id, status);
    }

    @Override
    public DiscountModel findDiscountById(Integer id) {
        return discountMapper.findDiscountById(id);
    }

    @Override
    public void deleDiscount(Integer id) {
        discountMapper.deleDiscount(id);
    }
}
