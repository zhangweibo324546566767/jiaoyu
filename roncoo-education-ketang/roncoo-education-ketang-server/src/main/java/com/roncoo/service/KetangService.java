package com.roncoo.service;


import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;
import com.roncoo.education.ketang.common.model.WentiFenlei;
import com.roncoo.education.ketang.common.model.WentiHuifu;

import java.util.List;

public interface KetangService {


    List<Wenti> findGoodsAll(Wenti wenti);

    Long findGoodsCount(Wenti wenti);

    void deleteGoods(String ids);

    List<Wenti> findGoodsAll2(Wenti wenti);

    Long findGoodsCount2(Wenti wenti);


    //分类
    List<WentiFenlei> findGoodsAllfenlei(WentiFenlei wentiFenlei);

    Long findGoodsCountfenlei(WentiFenlei wentiFenlei);

    void delete(String ids);



    //回复
    List<WentiHuifu> findGoodsAllhuifu(WentiHuifu wentiHuifu,Integer id);

    Long findGoodsCounthuifu(WentiHuifu wentiHuifu);

    List<WentiHuifu> findGoodsAllhuifu2(WentiHuifu wentiHuifu);

    void deleteGoodshuifu(String ids);
}

