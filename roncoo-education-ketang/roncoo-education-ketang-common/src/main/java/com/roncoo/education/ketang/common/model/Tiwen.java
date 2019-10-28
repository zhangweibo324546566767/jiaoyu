package com.roncoo.education.ketang.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Tiwen implements Serializable {
    private Integer tiwenid;
    private String tiwenname;
    private String tiwenmiaoshu;
    private String tiwentype;
    private String tiwenketangname;
    private String tiwencount;
    private String tiwenlaiyuan;


    private String tiwendate;

    private String startdate;

    private String enddate;

    private Integer userId;
    private String userNickName;


    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Integer getTiwenid() {
        return tiwenid;
    }

    public void setTiwenid(Integer tiwenid) {
        this.tiwenid = tiwenid;
    }

    public String getTiwenname() {
        return tiwenname;
    }

    public void setTiwenname(String tiwenname) {
        this.tiwenname = tiwenname;
    }

    public String getTiwenmiaoshu() {
        return tiwenmiaoshu;
    }

    public void setTiwenmiaoshu(String tiwenmiaoshu) {
        this.tiwenmiaoshu = tiwenmiaoshu;
    }

    public String getTiwentype() {
        return tiwentype;
    }

    public void setTiwentype(String tiwentype) {
        this.tiwentype = tiwentype;
    }

    public String getTiwenketangname() {
        return tiwenketangname;
    }

    public void setTiwenketangname(String tiwenketangname) {
        this.tiwenketangname = tiwenketangname;
    }

    public String getTiwencount() {
        return tiwencount;
    }

    public void setTiwencount(String tiwencount) {
        this.tiwencount = tiwencount;
    }

    public String getTiwenlaiyuan() {
        return tiwenlaiyuan;
    }

    public void setTiwenlaiyuan(String tiwenlaiyuan) {
        this.tiwenlaiyuan = tiwenlaiyuan;
    }

    public String getTiwendate() {
        return tiwendate;
    }

    public void setTiwendate(String tiwendate) {
        this.tiwendate = tiwendate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}