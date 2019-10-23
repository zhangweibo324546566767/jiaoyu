package com.roncoo.education.ketang.common.model;

import java.io.Serializable;

public class Wenti implements Serializable {
    private Integer id;
    private String username;
    private String type;
    private String miaoshu;
    private Integer countshu;
    private Integer liulanshu;

    private Integer userid;
    private String userNickName;

    private Integer fenleiid;
    private String  fenleiname;


    public String getFenleiname() {
        return fenleiname;
    }

    public void setFenleiname(String fenleiname) {
        this.fenleiname = fenleiname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public Integer getCountshu() {
        return countshu;
    }

    public void setCountshu(Integer countshu) {
        this.countshu = countshu;
    }

    public Integer getLiulanshu() {
        return liulanshu;
    }

    public void setLiulanshu(Integer liulanshu) {
        this.liulanshu = liulanshu;
    }
}
