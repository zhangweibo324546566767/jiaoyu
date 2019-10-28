package com.roncoo.education.yunying.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CouponModel {

    /**
     * 优惠券Id
     */
    private Integer couponId;

    /**
     *优惠券编码
     */
    private String couponNumber;

    /**
     *机构Id
     */
    private Integer couponAffilation;

    /**
     *优惠券满额
     */
    private Integer couponFull;

    /**
     *优惠券满减额
     */
    private Integer couponReduce;

    /**
     *优惠劵有效期限
     */
    private Integer couponEffective;

    /**
     *优惠劵总数
     */
    private Integer couponCount;

    /**
     *优惠劵派发
     */
    private Integer couponUse;

    /**
     * 优惠劵状态
     */
    private Integer couponStatus;

    /**
     *优惠劵截止日期
     */
    private String stopDate;

    /**
     * 机构名称
     */
    private String jgname;

    /**
     * 领取状态 receiveStatus
     */
    private Integer  receiveStatus;
}
