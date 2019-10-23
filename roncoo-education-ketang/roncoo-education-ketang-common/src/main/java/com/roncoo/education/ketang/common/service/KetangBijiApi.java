package com.roncoo.education.ketang.common.service;

import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface KetangBijiApi {

    @RequestMapping("findBijiAll")
    List<Biji> findBijiAll(@RequestBody Biji biji);

    @RequestMapping("findBijiCount")
    Long findBijiCount(@RequestBody Biji biji);

    @RequestMapping("deleteBijis")
    Result deleteBijis(@RequestParam("ids") String ids);

    //提问
    @RequestMapping("findTiwenAll")
    List<Tiwen> findTiwenAll(@RequestBody Tiwen tiwen);

    @RequestMapping("findTiwenCount")
    Long findTiwenCount(@RequestBody Tiwen tiwen);

    @RequestMapping("deleteTiwens")
    Result deleteTiwens(@RequestParam("ids") String ids);


    //点评
    @RequestMapping("findDianpingAll")
    List<Dianping> findDianpingAll(@RequestBody Dianping dianping);
    @RequestMapping("findDianpingCount")
    Long findDianpingCount(@RequestBody Dianping dianping);
    @RequestMapping("deleteDianpings")
    Result deleteDianpings(@RequestParam("ids") String ids);
}
