package com.roncoo.education.ketang.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Biji implements Serializable {

    private Integer bijiid;
    private String bijiname;
    private String bijibiaoti;
    private String bijimiaoshu;
    private String bijitype;
    private String kechengname;
    private String gongkai;
    private String bijipinglun;
    private String bijilaiyuan;


    private String bijidate;


    private String startdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String enddate;

    public Integer getBijiid() {
        return bijiid;
    }

    public void setBijiid(Integer bijiid) {
        this.bijiid = bijiid;
    }

    public String getBijiname() {
        return bijiname;
    }

    public void setBijiname(String bijiname) {
        this.bijiname = bijiname;
    }

    public String getBijibiaoti() {
        return bijibiaoti;
    }

    public void setBijibiaoti(String bijibiaoti) {
        this.bijibiaoti = bijibiaoti;
    }

    public String getBijimiaoshu() {
        return bijimiaoshu;
    }

    public void setBijimiaoshu(String bijimiaoshu) {
        this.bijimiaoshu = bijimiaoshu;
    }

    public String getBijitype() {
        return bijitype;
    }

    public void setBijitype(String bijitype) {
        this.bijitype = bijitype;
    }

    public String getKechengname() {
        return kechengname;
    }

    public void setKechengname(String kechengname) {
        this.kechengname = kechengname;
    }

    public String getGongkai() {
        return gongkai;
    }

    public void setGongkai(String gongkai) {
        this.gongkai = gongkai;
    }

    public String getBijipinglun() {
        return bijipinglun;
    }

    public void setBijipinglun(String bijipinglun) {
        this.bijipinglun = bijipinglun;
    }

    public String getBijilaiyuan() {
        return bijilaiyuan;
    }

    public void setBijilaiyuan(String bijilaiyuan) {
        this.bijilaiyuan = bijilaiyuan;
    }

    public String getBijidate() {
        return bijidate;
    }

    public void setBijidate(String bijidate) {
        this.bijidate = bijidate;
    }

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
}
