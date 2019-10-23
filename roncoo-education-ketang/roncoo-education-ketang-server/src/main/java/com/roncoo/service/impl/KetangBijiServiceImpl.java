package com.roncoo.service.impl;

import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;
import com.roncoo.mapper.KetangBijiMapper;
import com.roncoo.mapper.KetangTiwenMapper;
import com.roncoo.service.KetangBijiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KetangBijiServiceImpl implements KetangBijiService {

    @Autowired
    private KetangBijiMapper ketangBijiMapper;

    @Override
    public List<Biji> findBijiAll(Biji biji) {
        return ketangBijiMapper.findBijiAll(biji);
    }

    @Override
    public Long findBijiCount(Biji biji) {
        return ketangBijiMapper.findBijiCount(biji);
    }

    @Override
    public void deleteBijis(String ids) {
        ketangBijiMapper.deleteBijis(ids);
    }


    //提问
    @Autowired
    private KetangTiwenMapper ketangTiwenMapper;

    @Override
    public List<Tiwen> findTiwenAll(Tiwen tiwen) {
        return ketangTiwenMapper.findTiwenAll(tiwen);
    }

    @Override
    public Long findTiwenCount(Tiwen tiwen) {
        return ketangTiwenMapper.findTiwenCount(tiwen);
    }

    @Override
    public void deleteTiwens(String ids) {
        ketangTiwenMapper.deleteTiwens(ids);
    }



    //点评
    @Override
    public List<Dianping> findDianpingAll(Dianping dianping) {
        return ketangTiwenMapper.findDianpingAll(dianping);
    }

    @Override
    public Long findDianpingCount(Dianping dianping) {
        return ketangTiwenMapper.findDianpingCount(dianping);
    }

    @Override
    public void deleteDianpings(String ids) {
        ketangTiwenMapper.deleteDianpings(ids);
    }


}
