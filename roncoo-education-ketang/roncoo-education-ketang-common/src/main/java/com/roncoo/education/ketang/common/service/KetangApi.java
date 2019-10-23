package com.roncoo.education.ketang.common.service;


import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;
import com.roncoo.education.ketang.common.model.WentiFenlei;
import com.roncoo.education.ketang.common.model.WentiHuifu;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface KetangApi {

    @RequestMapping("findGoodsAll")
    public List<Wenti> findGoodsAll(@RequestBody Wenti wenti);

    @RequestMapping("findGoodsCount")
    public Long findGoodsCount(@RequestBody Wenti wenti);

    @RequestMapping("deleteGoods")
    Result deleteGoods(@RequestParam("ids") String ids);

    @RequestMapping("findGoodsAll2")
    List<Wenti> findGoodsAll2(@RequestBody Wenti wenti);

    @RequestMapping("findGoodsCount2")
    Long findGoodsCount2(@RequestBody Wenti wenti);


    //分类
    @RequestMapping("findGoodsAllfenlei")
    List<WentiFenlei> findGoodsAllfenlei(@RequestBody WentiFenlei wentiFenlei);

    @RequestMapping("findGoodsCountfenlei")
    Long findGoodsCountfenlei(@RequestBody WentiFenlei wentiFenlei);

    @RequestMapping("delete")
    Result delete(@RequestParam("ids") String ids);


    //回复
    @RequestMapping("findGoodsAllhuifu")
    List<WentiHuifu> findGoodsAllhuifu(@RequestBody WentiHuifu wentiHuifu,@RequestParam("id") Integer id);

    @RequestMapping("findGoodsCounthuifu")
    Long findGoodsCounthuifu(@RequestBody WentiHuifu wentiHuifu);

    @RequestMapping("findGoodsAllhuifu2")
    List<WentiHuifu> findGoodsAllhuifu2(@RequestBody WentiHuifu wentiHuifu);

    @RequestMapping("deleteGoodshuifu")
    Result deleteGoodshuifu(@RequestParam("ids") String ids);
}

