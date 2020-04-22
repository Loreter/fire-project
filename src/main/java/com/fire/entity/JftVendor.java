package com.fire.entity;

import java.math.BigInteger;
import java.io.Serializable;

/**
 * (JftVendor)实体类
 *
 * @author makejava
 * @since 2020-03-23 19:22:38
 */
public class JftVendor implements Serializable {
    private static final long serialVersionUID = -94316180103333918L;
    /**
    * 自增主键
    */
    private BigInteger logicId;
    /**
    * 商户编号
    */
    private String vendorId;
    /**
    * 商户名称
    */
    private String vendorName;
    /**
    * 年龄
    */
    private Integer vendorAge;
    /**
    * 商户地址
    */
    private String vendorAddress;
    /**
    * 性别：1-男，0-女
    */
    private Integer vendorGendor;
    /**
    * 开户行
    */
    private String vendorAccount;
    /**
    * 账户账号
    */
    private String vendorAccountNo;
    /**
    * 账户名称
    */
    private String vendorAccountName;


    public BigInteger getLogicId() {
        return logicId;
    }

    public void setLogicId(BigInteger logicId) {
        this.logicId = logicId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getVendorAge() {
        return vendorAge;
    }

    public void setVendorAge(Integer vendorAge) {
        this.vendorAge = vendorAge;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public Integer getVendorGendor() {
        return vendorGendor;
    }

    public void setVendorGendor(Integer vendorGendor) {
        this.vendorGendor = vendorGendor;
    }

    public String getVendorAccount() {
        return vendorAccount;
    }

    public void setVendorAccount(String vendorAccount) {
        this.vendorAccount = vendorAccount;
    }

    public String getVendorAccountNo() {
        return vendorAccountNo;
    }

    public void setVendorAccountNo(String vendorAccountNo) {
        this.vendorAccountNo = vendorAccountNo;
    }

    public String getVendorAccountName() {
        return vendorAccountName;
    }

    public void setVendorAccountName(String vendorAccountName) {
        this.vendorAccountName = vendorAccountName;
    }

}