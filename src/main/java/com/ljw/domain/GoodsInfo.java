package com.ljw.domain;

import java.util.Date;

/**
 * @Description 商品通用表
 * @Author Create by junwei.liang on 2018/8/1
 */
public class GoodsInfo {
    private Integer id;//编号
    private Integer menuId;//二级栏目编号
    private String number;//货号
    private String name;//名称
    private String picture;//图片地址
    private Integer stock;//库存
    private Integer drimecost;//原价（备用）
    private Integer price;//售价
    private String unit;//商品单位
    private Integer hot;//是否热销（0：否；1：是）
    private Integer fAttributeId;//第一属性（品牌分类）编号（t_attribute_info->id）
    private Integer sAttributeId;//第二属性（纯度）编号（t_attribute_info->id）
    private String region;//地域
    private Integer sort;//排序（越大越靠前）
    private String cas;//CAS
    private String other;//自定义属性
    private String seoTitle;//网站SEO优化——标题
    private String seoKeywords;//网站SEO优化——关键字
    private String seoDescription;//网站SEO优化——描述
    private Date updatedAt;//修改时间
    private Date createdAt;//创建时间
    private Date deletedAt;//删除时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDrimecost() {
        return drimecost;
    }

    public void setDrimecost(Integer drimecost) {
        this.drimecost = drimecost;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getfAttributeId() {
        return fAttributeId;
    }

    public void setfAttributeId(Integer fAttributeId) {
        this.fAttributeId = fAttributeId;
    }

    public Integer getsAttributeId() {
        return sAttributeId;
    }

    public void setsAttributeId(Integer sAttributeId) {
        this.sAttributeId = sAttributeId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}

