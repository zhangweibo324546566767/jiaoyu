package com.roncoo.controller.lt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("yemian")
public class YemianController {
    //后台总页面
    @RequestMapping("toyemian")
    public String toyemian(){
        return "admin";
    }

    //问答管理
    @RequestMapping("findGoodsAll")
    public String findGoodsAll(){
      return "lt/wenda";
    }
    @RequestMapping("findGoodsCount")
    public String findGoodsCount(){
        return "lt/wenda";
    }

    //问答分类页面
    @RequestMapping("tofenlei")
    public String tofenlei(){
        return "lt/wendafenlei";
    }

    @RequestMapping("tohuifu")
    public String tohuifu(){
        return "lt/wendahuifu";
    }

    @RequestMapping("tohuifu2")
    public String tohuifu2(){
        return "lt/wendahuifu2";
    }

    //笔记管理
    @RequestMapping("tobiji")
    public String tobiji(){
        return "lt/biji";
    }


    //提问管理
    @RequestMapping("towenti")
    public String towenti(){
        return "lt/tiwen2";
    }

    //点评管理
    @RequestMapping("todianping")
    public String todianping(){
        return "lt/dianping";
    }

    //文库管理
    @RequestMapping("towenku")
    public String towenku(){
        return "lt/wenku";
    }

    //分类配置
    @RequestMapping("topeizhi")
    public String topeizhi(){
        return "lt/peizhi";
    }
}
