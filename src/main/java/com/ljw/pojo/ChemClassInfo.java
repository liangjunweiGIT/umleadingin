package com.ljw.pojo;

import java.util.Date;

/**
 * @Description:化学商品种类
 * @Author Created by liangjunwei on 2018/8/2 17:39
 */
public class ChemClassInfo {
    private Integer id;//编号
    private Integer menuId;//二级栏目编号（t_menu_info->id）
    private String name;//名称
    private String subName;//中文别名
    private String englishName;//英文名称
    private String picture;//图片
    private String cas;//CAS号
    private String molecule;//分子式
    private Integer hot;//是否热销（0：否；1：是）
    private Integer sort;//排序（越大越靠前）
    private String fAttributeIds;//第一属性（品牌分类）编号集（t_attribute_info->id）
    private String sAttributeIds;//第二属性（纯度）编号集（t_attribute_info->id）
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getMolecule() {
        return molecule;
    }

    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getfAttributeIds() {
        return fAttributeIds;
    }

    public void setfAttributeIds(String fAttributeIds) {
        this.fAttributeIds = fAttributeIds;
    }

    public String getsAttributeIds() {
        return sAttributeIds;
    }

    public void setsAttributeIds(String sAttributeIds) {
        this.sAttributeIds = sAttributeIds;
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
