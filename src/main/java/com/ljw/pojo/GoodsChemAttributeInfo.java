package com.ljw.pojo;

import java.util.Date;

/**
 * @Description
 * @Author Create by junwei.liang on 2018/8/1
 */
public class GoodsChemAttributeInfo {
    private Integer id;//编号
    private Integer goodsId;//对应的商品编号
    private String spec;//规格
    private String delivery;//货期
    private String depot;//仓库
    private String merchant;//品牌商户号
    private String molecular;//分子量
    private String accurate;//精确量
    private String chemClassId;//化学商品种类编号
    private Date updatedAt;//修改时间
    private Date createdAt;//创建时间
    private Date deletedAt;//删除时间

    @Override
    public String toString() {
        return "GoodsChemAttributeInfo{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", spec='" + spec + '\'' +
                ", delivery='" + delivery + '\'' +
                ", depot='" + depot + '\'' +
                ", merchant='" + merchant + '\'' +
                ", molecular='" + molecular + '\'' +
                ", accurate='" + accurate + '\'' +
                ", chemClassId='" + chemClassId + '\'' +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", deletedAt=" + deletedAt +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getMolecular() {
        return molecular;
    }

    public void setMolecular(String molecular) {
        this.molecular = molecular;
    }

    public String getAccurate() {
        return accurate;
    }

    public void setAccurate(String accurate) {
        this.accurate = accurate;
    }

    public String getChemClassId() {
        return chemClassId;
    }

    public void setChemClassId(String chemClassId) {
        this.chemClassId = chemClassId;
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
