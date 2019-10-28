package com.roncoo.service;

import com.roncoo.education.yunying.common.model.InformationModel;
import com.roncoo.education.yunying.common.model.InformationTypeModel;

import java.util.List;

public interface InformationService {
    List<InformationModel> findInformation(InformationModel findInformation);

    List<InformationTypeModel> findIngormationType();

    void updeteStatus(Integer id, Integer status);

    InformationModel updeteById(Integer id);

    void updateInformation(InformationModel information);

    void deleIngormation(Integer id);

    void addInformation(InformationModel information);
}
