package com.roncoo.education.yunying.common.model;


import lombok.Data;

@Data
public class VipLev {

    private Integer vipId;
    private String vipName;
    private Integer vipLev;
    private Integer monthFee;
    private Integer yearFee;
    private Integer status;
    private String pcImg;
    private String h5Img;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
