package com.roncoo.controller.lt;

import com.roncoo.KetangBijiService;
import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("biji")
public class BijiController {

    @Autowired
    private KetangBijiService ketangBijiService;
    //笔记
    @RequestMapping("findBijiAll")
    @ResponseBody
    public List<Biji> findBijiAll(Biji biji){
        return ketangBijiService.findBijiAll(biji);
    }

    @RequestMapping("findBijiCount")
    @ResponseBody
    public Long findBijiCount(Biji biji) {
        return ketangBijiService.findBijiCount(biji);
    }

    @RequestMapping("deleteBijis")
    @ResponseBody
    public Result deleteBijis(String ids){
        return ketangBijiService.deleteBijis(ids);
    }


    //提问管理
    @RequestMapping("findTiwenAll")
    @ResponseBody
    public List<Tiwen> findTiwenAll(Tiwen tiwen){
        return ketangBijiService.findTiwenAll(tiwen);
    }

    @RequestMapping("findTiwenCount")
    @ResponseBody
    public Long findTiwenCount(Tiwen tiwen) {
        return ketangBijiService.findTiwenCount(tiwen);
    }

    @RequestMapping("deleteTiwens")
    @ResponseBody
    public Result deleteTiwens(String ids){
        return ketangBijiService.deleteTiwens(ids);
    }


    //点评管理
    @RequestMapping("findDianpingAll")
    @ResponseBody
    public List<Dianping> findDianpingAll(Dianping dianping){
        return ketangBijiService.findDianpingAll(dianping);
    }

    @RequestMapping("findDianpingCount")
    @ResponseBody
    public Long findDianpingCount(Dianping dianping) {
        return ketangBijiService.findDianpingCount(dianping);
    }
    @RequestMapping("deleteDianpings")
    @ResponseBody
    public Result deleteDianpings(String ids){
        return ketangBijiService.deleteDianpings(ids);
    }
}
