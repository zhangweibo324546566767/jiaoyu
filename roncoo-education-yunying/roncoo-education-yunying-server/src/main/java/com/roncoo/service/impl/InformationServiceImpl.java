package com.roncoo.service.impl;

import com.roncoo.education.yunying.common.model.InformationModel;
import com.roncoo.education.yunying.common.model.InformationTypeModel;
import com.roncoo.mapper.InformationMapper;
import com.roncoo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper informationMapper;

    @Override
    public List<InformationModel> findInformation(InformationModel findInformation) {
        return informationMapper.findInformation(findInformation);
    }

    @Override
    public List<InformationTypeModel> findIngormationType() {
        return informationMapper.findIngormationType();
    }

    @Override
    public void updeteStatus(Integer id, Integer status) {
        informationMapper.updeteStatus(id, status);
    }

    @Override
    public InformationModel updeteById(Integer id) {
        return informationMapper.updeteById(id);
    }

    @Override
    public void updateInformation(InformationModel information) {
        informationMapper.updateInformation(information);
    }

    @Override
    public void deleIngormation(Integer id) {
        informationMapper.deleIngormation(id);
    }

    @Override
    public void addInformation(InformationModel information) {
        informationMapper.addInformation(information);
    }
}
