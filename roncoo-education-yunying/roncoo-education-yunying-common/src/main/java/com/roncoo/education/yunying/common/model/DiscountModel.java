package com.roncoo.education.yunying.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class DiscountModel implements Serializable {

    /**
     *打折卡id
     */
    private Integer discountId;

    /**
     *打折卡机构
     */
    private Integer discountAffiliation;

    /**
     *打折卡编号
     */
    private String discountNumber;

    /**
     *打折卡折扣
     */
    private Integer discountBuckle;

    /**
     *打折卡有效期
     */
    private String discountEffective;

    /**
     *打折卡总数
     */
    private Integer discountCount;

    /**
     *打折卡已发放数
     */
    private Integer discountUse;

    /**
     *打折卡截止日期
     */
    private String stopDate;

    /**
     *打折卡状态
     */
    private Integer discountStatus;

    /**
     *打折卡机构名称
     */
    private String jgname;

    /**
     * 领取状态 receiveStatus
     */
    private Integer  receiveStatus;

}
