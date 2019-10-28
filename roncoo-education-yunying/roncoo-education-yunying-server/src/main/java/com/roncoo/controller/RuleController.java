package com.roncoo.controller;


import com.roncoo.education.yunying.common.model.IntegrationRule;
import com.roncoo.education.yunying.common.service.RuleApi;
import com.roncoo.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RuleController implements RuleApi {

    @Autowired
    private RuleService ruleService;



    @Override
    public Map findIntegralRule(Map param) {
        Map result = ruleService.findIntegralRule(param);
        return result;
    }

    @Override
    public void updateMemberModel(Integer status) {
        ruleService.updateMemberModel(status);
    }

    @Override
    public Map findMemberStatus() {

        Map status = ruleService.findMemberStatus();
        return status;
    }

    @Override
    public Map findMarketing() {

        Map result = ruleService.findMarketing();

        return result;
    }

    @Override
    public void saveMarketingSwitch(Map param) {
        ruleService.saveMarketingSwitch(param);
    }
}
