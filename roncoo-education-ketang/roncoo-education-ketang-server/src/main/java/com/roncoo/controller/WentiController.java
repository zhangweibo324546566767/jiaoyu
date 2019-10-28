package com.roncoo.controller;


import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;

import com.roncoo.education.ketang.common.model.WentiFenlei;
import com.roncoo.education.ketang.common.model.WentiHuifu;
import com.roncoo.education.ketang.common.service.KetangApi;
import com.roncoo.service.KetangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WentiController implements KetangApi {

    @Autowired
    private KetangService ketangService;


    @Override
    public List<Wenti> findGoodsAll(@RequestBody Wenti wenti) {
        return ketangService.findGoodsAll(wenti);
    }

    @Override
    public Long findGoodsCount(@RequestBody Wenti wenti) {
        return ketangService.findGoodsCount(wenti);
    }

    @Override
    public Result deleteGoods(String ids) {
        try {
            ketangService.deleteGoods(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @Override
    public List<Wenti> findGoodsAll2(@RequestBody Wenti wenti) {
        return ketangService.findGoodsAll2(wenti);
    }

    @Override
    public Long findGoodsCount2(@RequestBody Wenti wenti) {
        return ketangService.findGoodsCount2(wenti);
    }
    //分类
    @Override
    public List<WentiFenlei> findGoodsAllfenlei(@RequestBody WentiFenlei wentiFenlei) {
        return ketangService.findGoodsAllfenlei(wentiFenlei);
    }

    @Override
    public Long findGoodsCountfenlei(@RequestBody WentiFenlei wentiFenlei) {
        return ketangService.findGoodsCountfenlei(wentiFenlei);
    }

    @Override
    public Result delete(String ids) {
        try {
            ketangService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }


   //回复
    @Override
    public List<WentiHuifu> findGoodsAllhuifu(@RequestBody WentiHuifu wentiHuifu,@RequestParam("id") Integer id) {
        return ketangService.findGoodsAllhuifu(wentiHuifu,id);
    }

    @Override
    public Long findGoodsCounthuifu(@RequestBody WentiHuifu wentiHuifu) {
        return ketangService.findGoodsCounthuifu(wentiHuifu);
    }

    @Override
    public List<WentiHuifu> findGoodsAllhuifu2(WentiHuifu wentiHuifu) {
        return  ketangService.findGoodsAllhuifu2(wentiHuifu);
    }

    @Override
    public Result deleteGoodshuifu(String ids) {
        try {
            ketangService.deleteGoodshuifu(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }


}
