package com.roncoo.education.yunying.common.model;


import java.util.List;

public class CourseCategory {

    private Integer id;
    private String name;
    private Integer pid;
    private List<CourseCategory> children;
    private Integer coureseId;

    public Integer getCoureseId() {
        return coureseId;
    }

    public void setCoureseId(Integer coureseId) {
        this.coureseId = coureseId;
    }

    public List<CourseCategory> getChildren() {
        return children;
    }

    public void setChildren(List<CourseCategory> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
