package com.roncoo.education.yunying.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AffiliationModel {

    private Integer id;

    private String jgname;

    private Integer pid;
}
