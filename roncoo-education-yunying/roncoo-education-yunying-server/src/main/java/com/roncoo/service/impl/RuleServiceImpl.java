package com.roncoo.service.impl;

import com.roncoo.education.yunying.common.model.IntegrationRule;
import com.roncoo.mapper.RuleMapper;
import com.roncoo.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public Map findIntegralRule(Map param) {
        Map result = new HashMap();
        List<IntegrationRule> list = ruleMapper.findIntegralRule(param);
        result.put("IntegrationRuleList",list);
        return result;
    }

    @Override
    public void updateMemberModel(Integer status) {
        ruleMapper.updateMemberModel(status);
    }

    @Override
    public Map findMemberStatus() {

        Map map = ruleMapper.findMemberStatus();
        return map;
    }

    @Override
    public Map findMarketing() {

        Map map = ruleMapper.findMarketing();

        return map;
    }

    @Override
    public void saveMarketingSwitch(Map param) {
        ruleMapper.saveMarketingSwitch(param);
    }
}
