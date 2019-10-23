package com.roncoo.mapper;

import com.roncoo.education.ketang.common.model.Dianping;
import com.roncoo.education.ketang.common.model.Tiwen;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface KetangTiwenMapper {

    //提问
    List<Tiwen> findTiwenAll(Tiwen tiwen);

    Long findTiwenCount(Tiwen tiwen);

    @Delete("delete from ketang_tiwen where tiwenid in (${value})")
    void deleteTiwens(String ids);

    //点评
    List<Dianping> findDianpingAll(Dianping dianping);

    Long findDianpingCount(Dianping dianping);

    @Delete("delete from ketang_dianping where dianpingid in (${value})")
    void deleteDianpings(String ids);
}
