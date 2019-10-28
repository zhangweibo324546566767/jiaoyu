package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.AffiliationModel;
import com.roncoo.education.yunying.common.model.DiscountModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface DiscountServiceApi {

    @RequestMapping("findDiscountList")
    List<DiscountModel> findDiscountList();

    @RequestMapping("updateDiscountStatus")
    void updateDiscountStatus(@RequestParam Integer id, @RequestParam Integer status);

    @RequestMapping("findDiscountById")
    DiscountModel findDiscountById(@RequestParam Integer id);

    @RequestMapping("deleDiscount")
    void deleDiscount(@RequestParam Integer id);
}
