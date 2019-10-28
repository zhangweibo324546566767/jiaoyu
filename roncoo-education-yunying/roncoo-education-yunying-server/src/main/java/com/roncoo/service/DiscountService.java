package com.roncoo.service;

import com.roncoo.education.yunying.common.model.DiscountModel;

import java.util.List;

public interface DiscountService {
    List<DiscountModel> findDiscountList();

    void updateDiscountStatus(Integer id, Integer status);

    DiscountModel findDiscountById(Integer id);

    void deleDiscount(Integer id);
}
