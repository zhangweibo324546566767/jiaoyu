package com.roncoo.controller;

import com.roncoo.education.ketang.common.entity.Result;
import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;
import com.roncoo.education.ketang.common.service.KetangBijiApi;
import com.roncoo.service.KetangBijiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KetangBijController implements KetangBijiApi {

    @Autowired
    private KetangBijiService ketangBijiService;

    @Override
    public List<Biji> findBijiAll(@RequestBody Biji biji) {
        return ketangBijiService.findBijiAll(biji);
    }

    @Override
    public Long findBijiCount(@RequestBody Biji biji) {
        return ketangBijiService.findBijiCount(biji);
    }

    @Override
    public Result deleteBijis(String ids) {
        try {
            ketangBijiService.deleteBijis(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    //提问
    @Override
    public List<Tiwen> findTiwenAll(@RequestBody Tiwen tiwen) {
        return ketangBijiService.findTiwenAll(tiwen);
    }

    @Override
    public Long findTiwenCount(@RequestBody Tiwen tiwen) {
        return ketangBijiService.findTiwenCount(tiwen);
    }

    @Override
    public Result deleteTiwens(String ids) {
        try {
            ketangBijiService.deleteTiwens(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    //点评
    @Override
    public List<Dianping> findDianpingAll(@RequestBody Dianping dianping) {
        return ketangBijiService.findDianpingAll(dianping);
    }

    @Override
    public Long findDianpingCount(@RequestBody Dianping dianping) {
        return ketangBijiService.findDianpingCount(dianping);
    }

    @Override
    public Result deleteDianpings(String ids) {
        try {
            ketangBijiService.deleteDianpings(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }
}
