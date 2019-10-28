package com.roncoo.controller;

import com.roncoo.education.yunying.common.model.DiscountModel;
import com.roncoo.education.yunying.common.service.DiscountServiceApi;
import com.roncoo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController implements DiscountServiceApi {

    @Autowired
    private DiscountService discountService;


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

}
