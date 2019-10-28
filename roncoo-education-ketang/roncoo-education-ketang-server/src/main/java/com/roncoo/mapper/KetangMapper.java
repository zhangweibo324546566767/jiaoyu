package com.roncoo.mapper;

import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;
import com.roncoo.education.ketang.common.model.WentiFenlei;
import com.roncoo.education.ketang.common.model.WentiHuifu;
import org.apache.ibatis.annotations.Delete;

import java.util.List;


public interface KetangMapper {


    List<Wenti> findGoodsAll(Wenti wenti);

    Long findGoodsCount(Wenti wenti);

    @Delete("delete from ketang_wenti where id in (${value})")
    void deleteGoods(String ids);

    List<Wenti> findGoodsAll2(Wenti wenti);

    Long findGoodsCount2(Wenti wenti);


    //分类
    List<WentiFenlei> findGoodsAllfenlei(WentiFenlei wentiFenlei);

    Long findGoodsCountfenlei(WentiFenlei wentiFenlei);

    @Delete("delete from ketang_wentifenlei where fenleiid in (${value})")
    void delete(String ids);



    //回复
    List<WentiHuifu> findGoodsAllhuifu(WentiHuifu wentiHuifu,Integer id);

    Long findGoodsCounthuifu(WentiHuifu wentiHuifu);


    List<WentiHuifu> findGoodsAllhuifu2(WentiHuifu wentiHuifu);

    @Delete("delete from ketang_wentihuifu where id in (${value})")
    void deleteGoodshuifu(String ids);
}

