package com.roncoo.mapper;

import com.roncoo.education.ketang.common.model.Biji;
import com.roncoo.education.ketang.common.model.Tiwen;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface KetangBijiMapper {
    List<Biji> findBijiAll(Biji biji);

    Long findBijiCount(Biji biji);

    @Delete("delete from ketang_biji where bijiid in (${value})")
    void deleteBijis(String ids);


}
