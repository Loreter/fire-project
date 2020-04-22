package com.fire.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户优惠活动使用情况表(JftUserPromotionUsage)实体类
 *
 * @author makejava
 * @since 2020-04-11 22:35:14
 */
public class JftUserPromotionUsage implements Serializable {
    private static final long serialVersionUID = 618669068505915752L;
    /**
    * 自增长主键
    */
    private Long id;
    /**
    * 优惠编号
    */
    private String promotionId;
    /**
    * 商户编号
    */
    private String platVendorId;
    /**
    * 用户编号
    */
    private String userId;
    /**
    * 0-用户总次数，1-用户天使用次数，2-总金额
    */
    private String cumulateType;
    /**
    * 累计使用次数
    */
    private String usageTimes;
    /**
    * 累计使用金额
    */
    private String usageAmount;
    /**
    * 当累计类型为1时，记录日期，累计类型为0时，不使用
    */
    private String oredrDate;
    /**
    * 创建日期
    */
    private Date createTime;
    /**
    * 更新日期
    */
    private Date modifyTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPlatVendorId() {
        return platVendorId;
    }

    public void setPlatVendorId(String platVendorId) {
        this.platVendorId = platVendorId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCumulateType() {
        return cumulateType;
    }

    public void setCumulateType(String cumulateType) {
        this.cumulateType = cumulateType;
    }

    public String getUsageTimes() {
        return usageTimes;
    }

    public void setUsageTimes(String usageTimes) {
        this.usageTimes = usageTimes;
    }

    public String getUsageAmount() {
        return usageAmount;
    }

    public void setUsageAmount(String usageAmount) {
        this.usageAmount = usageAmount;
    }

    public String getOredrDate() {
        return oredrDate;
    }

    public void setOredrDate(String oredrDate) {
        this.oredrDate = oredrDate;
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

}