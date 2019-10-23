package com.roncoo.service.impl;

import com.github.pagehelper.PageHelper;

import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;
import com.roncoo.education.ketang.common.model.WentiFenlei;
import com.roncoo.education.ketang.common.model.WentiHuifu;
import com.roncoo.mapper.KetangMapper;
import com.roncoo.service.KetangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KetangServiceImpl implements KetangService {

    @Autowired
    private KetangMapper ketangMapper;


    @Override
    public List<Wenti> findGoodsAll(Wenti wenti) {
        List<Wenti> list = ketangMapper.findGoodsAll(wenti);
        return list;
    }

    @Override
    public Long findGoodsCount(Wenti wenti) {
        return ketangMapper.findGoodsCount(wenti);
    }

    @Override
    public void deleteGoods(String ids) {
        ketangMapper.deleteGoods(ids);
    }


    @Override
    public List<Wenti> findGoodsAll2(Wenti wenti) {
        return ketangMapper.findGoodsAll2(wenti);
    }

    @Override
    public Long findGoodsCount2(Wenti wenti) {
        return ketangMapper.findGoodsCount2(wenti);
    }


    //分类
    @Override
    public List<WentiFenlei> findGoodsAllfenlei(WentiFenlei wentiFenlei) {
        return ketangMapper.findGoodsAllfenlei(wentiFenlei);
    }

    @Override
    public Long findGoodsCountfenlei(WentiFenlei wentiFenlei) {
        return ketangMapper.findGoodsCountfenlei(wentiFenlei);
    }

    @Override
    public void delete(String ids) {
         ketangMapper.delete(ids);
    }

    //回复
    @Override
    public List<WentiHuifu> findGoodsAllhuifu(WentiHuifu wentiHuifu,Integer id) {
        return ketangMapper.findGoodsAllhuifu(wentiHuifu,id);
    }

    @Override
    public Long findGoodsCounthuifu(WentiHuifu wentiHuifu) {
        return ketangMapper.findGoodsCounthuifu(wentiHuifu);
    }

    @Override
    public List<WentiHuifu> findGoodsAllhuifu2(WentiHuifu wentiHuifu) {
        return ketangMapper.findGoodsAllhuifu2(wentiHuifu);
    }

    @Override
    public void deleteGoodshuifu(String ids) {
        ketangMapper.deleteGoodshuifu(ids);
    }
}
