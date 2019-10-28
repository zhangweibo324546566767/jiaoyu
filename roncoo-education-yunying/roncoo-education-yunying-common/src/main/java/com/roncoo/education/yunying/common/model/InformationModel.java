package com.roncoo.education.yunying.common.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class InformationModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资讯id
     */
    private Integer informationId;

    /**
     * 资讯标题
     */
    private String informationTitle;

    /**
     * 资讯类型
     */
    private Integer informationType;

    /**
     * 资讯时间
     */
    private String informationTime;

    /**
     * 资讯来源
     */
    private String informationSource;

    /**
     * 资讯状态
     */
    private Integer informationStatus;

    /**
     * 资讯内容
     */
    private String informationContent;

    /**
     * 图片
     */
    private String attach;

    /**
     * 业务字段 类型名称
     */
    private String typeName;

    /**
     * 唯一标识
     */
    private Integer uniqueIdentification;
}
