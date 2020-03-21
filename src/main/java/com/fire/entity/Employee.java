package com.fire.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -87916930040871760L;
    /**
    * 雇员id
    */
    private Integer id;
    /**
    * 名字
    */
    private String lastName;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 性别1 男, 0 女
    */
    private Integer gender;
    /**
    * 部门id
    */
    private Integer department;
    /**
    * 生日
    */
    private Date birth;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

}