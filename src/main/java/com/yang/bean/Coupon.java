package com.yang.bean;

import java.util.Date;

public class Coupon {
    private String couponId;

    private String couponPrice;

    private String userId;

    private String orderId;

    private Long isUsed;

    private Date usedTime;

    public Coupon(String couponId, String couponPrice, String userId, String orderId, Long isUsed, Date usedTime) {
        this.couponId = couponId;
        this.couponPrice = couponPrice;
        this.userId = userId;
        this.orderId = orderId;
        this.isUsed = isUsed;
        this.usedTime = usedTime;
    }

    public Coupon() {
        super();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(String couponPrice) {
        this.couponPrice = couponPrice == null ? null : couponPrice.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Long isUsed) {
        this.isUsed = isUsed;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }
}