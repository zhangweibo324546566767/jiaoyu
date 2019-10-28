package com.roncoo.controller;

import com.roncoo.education.yunying.common.model.InformationModel;
import com.roncoo.education.yunying.common.model.InformationTypeModel;
import com.roncoo.education.yunying.common.service.InformationServiceApi;
import com.roncoo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class InformationController implements InformationServiceApi {

    @Autowired
    private InformationService informationService;

    @Override
    public List<InformationModel> findInformation(InformationModel findInformation) {

        return informationService.findInformation(findInformation);
    }


    @Override
    public List<InformationTypeModel> findIngormationType() {
        return informationService.findIngormationType();
    }

    @Override
    public void updeteStatus(@RequestParam Integer id, @RequestParam Integer status) {
        informationService.updeteStatus(id, status);
    }

    @Override
    public InformationModel updeteById(@RequestParam Integer id) {

        return informationService.updeteById(id);
    }

    @Override
    public void updateInformation(InformationModel information) {
        informationService.updateInformation(information);
    }

    @Override
    public void deleIngormation(@RequestParam Integer id) {
        informationService.deleIngormation(id);
    }

    @Override
    public void addInformation( InformationModel information) {
        informationService.addInformation(information);
    }
}
