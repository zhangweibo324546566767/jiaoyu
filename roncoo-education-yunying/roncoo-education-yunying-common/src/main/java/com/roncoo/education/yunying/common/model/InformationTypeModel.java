package com.roncoo.education.yunying.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class InformationTypeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资讯类型id
     */
    private Integer typeId;

    /**
     * 资讯类型名称
     */
    private String typeName;
}
