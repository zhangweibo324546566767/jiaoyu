package com.roncoo.education.ketang.common.model;

import java.io.Serializable;

public class WentiFenlei implements Serializable {

    private Integer fenleiid;
    private String fenleiname;

    public Integer getFenleiid() {
        return fenleiid;
    }

    public void setFenleiid(Integer fenleiid) {
        this.fenleiid = fenleiid;
    }

    public String getFenleiname() {
        return fenleiname;
    }

    public void setFenleiname(String fenleiname) {
        this.fenleiname = fenleiname;
    }
}
