package com.roncoo.education.yunying.common.service;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface RuleApi {

    @RequestMapping("findIntegralRule")
    Map findIntegralRule(Map param);

    @RequestMapping("updateMemberModel")
    void updateMemberModel(@RequestParam("status") Integer status);

    @RequestMapping("findMemberStatus")
    Map findMemberStatus();

    @RequestMapping("findMarketing")
    Map findMarketing();

    @RequestMapping("saveMarketingSwitch")
    void saveMarketingSwitch(@RequestBody Map param);
}
