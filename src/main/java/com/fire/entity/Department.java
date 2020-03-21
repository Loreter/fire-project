package com.fire.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
public class Department implements Serializable {
    private static final long serialVersionUID = -36980515989337456L;
    /**
    * 部门id
    */
    private Integer id;
    /**
    * 部门名字
    */
    private String departmentName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}