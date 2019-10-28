package com.roncoo.education.yunying.common.model;

import lombok.Data;

@Data
public class IntegrationRule {

    private Integer id;
    private String ruleName;
    private String ruleOtherName;
    private Integer type;
    private Integer integral;
    private Integer excuteNum;


}
