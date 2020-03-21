package com.fire.entity;

import java.math.BigInteger;
import java.util.Date;
import java.io.Serializable;

/**
 * 商户白名单详情表(JftVendorWhiteDetail)实体类
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
public class JftVendorWhiteDetail implements Serializable {
    private static final long serialVersionUID = 926690937444103038L;
    /**
    * 自增序列
    */
    private BigInteger logicId;
    /**
    * 字典表LOGIC_ID(关联字典表)
    */
    private String dictLogicId;
    /**
    * 商户编号
    */
    private String vendorid;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date modifyTime;
    /**
    * 运营用户编号
    */
    private String operator;
    /**
    * 0-不可用，1-可用
    */
    private String status;


    public BigInteger getLogicId() {
        return logicId;
    }

    public void setLogicId(BigInteger logicId) {
        this.logicId = logicId;
    }

    public String getDictLogicId() {
        return dictLogicId;
    }

    public void setDictLogicId(String dictLogicId) {
        this.dictLogicId = dictLogicId;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}