package com.roncoo.mapper;

import com.roncoo.education.yunying.common.model.IntegrationRule;

import java.util.List;
import java.util.Map;

public interface RuleMapper {


    List<IntegrationRule> findIntegralRule(Map param);

    void updateMemberModel(Integer status);

    Map findMemberStatus();

    Map findMarketing();

    void saveMarketingSwitch(Map param);
}
