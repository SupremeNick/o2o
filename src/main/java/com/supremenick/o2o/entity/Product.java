package com.supremenick.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * @author SupremeNick
 * @version 1.0
 * @date 2019/9/11 14:48
 * @description 商品类
 */
public class Product {
    // 商品Id
    private Long productId;
    // 商品名称
    private String productName;
    // 商品描述
    private String productDesc;
    // 商品缩略图地址
    private String imgAddr;
    // 原价
    private String normalPrice;
    // 折扣价
    private String promotionPrice;
    // 商品显示权重
    private Integer priority;
    // 商品创建时间
    private Date createTime;
    // 最近更新时间
    private Date lastEditTime;
    // 商品状态:0.下架 1.在前端展示系统展示
    private Integer enableStatus;
    // 商品详情图片列表
    private List<ProductImg> productImgList;
    // 商品类别
    private ProductCategory productCategory;
    // 商品所在店铺
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
