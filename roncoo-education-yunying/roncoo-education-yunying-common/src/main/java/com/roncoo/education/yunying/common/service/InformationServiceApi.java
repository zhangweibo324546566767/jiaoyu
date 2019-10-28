package com.roncoo.education.yunying.common.service;

import com.roncoo.education.yunying.common.model.InformationModel;
import com.roncoo.education.yunying.common.model.InformationTypeModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface InformationServiceApi {

    @RequestMapping("/findInformation")
    public List<InformationModel>findInformation(InformationModel information);

    @RequestMapping("findIngormationType")
    public List<InformationTypeModel>findIngormationType();

    @RequestMapping("updeteStatus")
    void updeteStatus(@RequestParam Integer id, @RequestParam Integer status);

    @RequestMapping("updeteById")
    InformationModel updeteById(@RequestParam Integer id);

    @RequestMapping("updateInformation")
    void updateInformation(InformationModel information);

    @RequestMapping("deleIngormation")
    void deleIngormation(@RequestParam Integer id);

    @RequestMapping("addInformation")
    void addInformation(@RequestBody InformationModel information);
}
