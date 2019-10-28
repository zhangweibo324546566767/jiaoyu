package com.roncoo.education.yunying.common.model;


import lombok.Data;

import java.util.List;

@Data
public class Course {

    private Integer id;
    private String courseName;
    private List<Course> children;



    public List<Course> getChildren() {
        return children;
    }

    public void setChildren(List<Course> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
