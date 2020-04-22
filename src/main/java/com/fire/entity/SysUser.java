package com.fire.entity;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-03-23 21:47:31
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -85144653713055925L;
    /**
    * 主键
    */
    private String id;
    /**
    * 账号
    */
    private String usercode;
    /**
    * 姓名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 盐
    */
    private String salt;
    /**
    * 账号是否锁定，1：锁定，0未锁定
    */
    private String locked;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

}