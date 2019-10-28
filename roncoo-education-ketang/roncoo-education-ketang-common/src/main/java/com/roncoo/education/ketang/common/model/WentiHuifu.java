package com.roncoo.education.ketang.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class WentiHuifu implements Serializable {

    private Integer id;
    private String wentiname;
    private Integer wentiid;
    private String wentimiaosu;
    private String wentitype;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date timeDate;
    private Integer userId;
    private Integer userid;
    private String userNickName;

    private Integer fenleiid;
    private String  fenleiname;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWentiname() {
        return wentiname;
    }

    public void setWentiname(String wentiname) {
        this.wentiname = wentiname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWentiid() {
        return wentiid;
    }

    public void setWentiid(Integer wentiid) {
        this.wentiid = wentiid;
    }

    public String getWentimiaosu() {
        return wentimiaosu;
    }

    public void setWentimiaosu(String wentimiaosu) {
        this.wentimiaosu = wentimiaosu;
    }

    public String getWentitype() {
        return wentitype;
    }

    public void setWentitype(String wentitype) {
        this.wentitype = wentitype;
    }

    public Date getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(Date timeDate) {
        this.timeDate = timeDate;
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
