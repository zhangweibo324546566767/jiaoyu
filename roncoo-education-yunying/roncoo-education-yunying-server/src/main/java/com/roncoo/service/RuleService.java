package com.roncoo.service;

import java.util.Map;

public interface RuleService {


    Map findIntegralRule(Map param);

    void updateMemberModel(Integer status);

    Map findMemberStatus();

    Map findMarketing();

    void saveMarketingSwitch(Map param);
}
