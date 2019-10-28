package com.roncoo.service;

import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;

import java.util.List;

public interface KetangBijiService {
    List<Biji> findBijiAll(Biji biji);

    Long findBijiCount(Biji biji);

    void deleteBijis(String ids);

    //提问
    List<Tiwen> findTiwenAll(Tiwen tiwen);

    Long findTiwenCount(Tiwen tiwen);

    void deleteTiwens(String ids);

    //点评
    List<Dianping> findDianpingAll(Dianping dianping);

    Long findDianpingCount(Dianping dianping);

    void deleteDianpings(String ids);
}
