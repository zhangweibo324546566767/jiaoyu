package com.roncoo.controller.lt;


import com.roncoo.KetangService;
import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Wenti;
import com.roncoo.education.ketang.common.model.WentiFenlei;

import com.roncoo.education.ketang.common.model.WentiHuifu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("hello")
public class HellController {

    @Autowired
    private KetangService ketangService;

    @RequestMapping("findGoodsAll")
    @ResponseBody
    public List<Wenti> findGoodsAll(Wenti wenti){
        return ketangService.findGoodsAll(wenti);
    }

    @RequestMapping("findGoodsCount")
    @ResponseBody
    public Long findGoodsCount(Wenti wenti) {
        return ketangService.findGoodsCount(wenti);
    }

    @RequestMapping("deleteGoods")
    @ResponseBody
    public Result deleteGoods(String ids){
        return ketangService.deleteGoods(ids);
    }



    @RequestMapping("findGoodsAll2")
    @ResponseBody
    public List<Wenti> findGoodsAll2(Wenti wenti){
        return ketangService.findGoodsAll2(wenti);
    }

    @RequestMapping("findGoodsCount2")
    @ResponseBody
    public Long findGoodsCount2(Wenti wenti) {
        return ketangService.findGoodsCount2(wenti);
    }


      //分类
    @RequestMapping("findGoodsAllfenlei")
    @ResponseBody
    public List<WentiFenlei> findGoodsAllfenlei(WentiFenlei wentiFenlei){
        return ketangService.findGoodsAllfenlei(wentiFenlei);
    }

    @RequestMapping("findGoodsCountfenlei")
    @ResponseBody
    public Long findGoodsCountfenlei(WentiFenlei wentiFenlei) {
        return ketangService.findGoodsCountfenlei(wentiFenlei);
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result delete(String ids){
        return ketangService.delete(ids);
    }




    //回复
    @RequestMapping("findGoodsAllhuifu")
    @ResponseBody
    public List<WentiHuifu> findGoodsAllhuifu(WentiHuifu wentiHuifu,Integer id){
        return ketangService.findGoodsAllhuifu(wentiHuifu,id);
    }

    @RequestMapping("findGoodsCounthuifu")
    @ResponseBody
    public Long findGoodsCounthuifu(WentiHuifu wentiHuifu) {
        return ketangService.findGoodsCounthuifu(wentiHuifu);
    }


    @RequestMapping("tohuifu")
    public String tohuifu(){
        return "lt/wendahuifu2";
    }

    @RequestMapping("findGoodsAllhuifu2")
    @ResponseBody
    public List<WentiHuifu> findGoodsAllhuifu2(WentiHuifu wentiHuifu){
        return ketangService.findGoodsAllhuifu2(wentiHuifu);
    }

    @RequestMapping("deleteGoodshuifu")
    @ResponseBody
    public Result deleteGoodshuifu(String ids){
        return ketangService.deleteGoodshuifu(ids);
    }
}
