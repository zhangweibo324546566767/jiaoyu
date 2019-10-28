package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.InformationModel;
import com.roncoo.education.yunying.common.model.InformationTypeModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface InformationMapper {

    @Select("select * from t_information ti left join t_information_type tit on ti.informationType=tit.typeId")
    List<InformationModel> findInformation(InformationModel findInformation);

    @Select("select * from t_information_type")
    List<InformationTypeModel> findIngormationType();

    @Update("update t_information set informationStatus=#{status} where informationId=#{id}")
    void updeteStatus(@Param("id") Integer id,@Param("status") Integer status);

    @Select("select * from t_information where informationId=#{id}")
    InformationModel updeteById(@Param("id") Integer id);

    @Update("update t_information set informationTitle=#{informationTitle},informationType=#{informationType},informationContent=#{informationContent},informationImg=#{informationImg},informationStatus=#{informationStatus},informationSource=#{informationSource} where informationId=#{informationId}")
    void updateInformation(InformationModel information);

    @Delete("delete from t_information where informationId=#{id}")
    void deleIngormation(@Param("id") Integer id);

    @Insert("insert into t_information (informationTitle,informationType,informationSource,informationContent,informationStatus,informationTime,attach) " +
            "values " +
            "(#{informationTitle},#{informationType},#{informationSource},#{informationContent},#{informationStatus},curdate(),#{attach})")
    void addInformation(InformationModel information);
}
