package com.roncoo.education.yunying.common.model;

import lombok.Data;

@Data
public class TeacherTitle {

    private Integer titleId;
    private String titleName;
    private Integer titleOrder;
    private Integer status;
    private String titleImg;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
