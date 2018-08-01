package com.ljw.domain;

/**
 * @Description
 * @Author Create by junwei.liang on 2018/8/1
 */
public class GoodsChemAttributeInfo{
    private Integer id;//编号
    private Integer goods_id;//对应的商品编号
    private Integer spec;//规格
    private Integer delivery;//货期
    private Integer depot;//仓库
    private Integer merchant;//品牌商户号
    private Integer molecular;//分子量
    private Integer accurate;//精确量
    private Integer chem_class_id;//化学商品种类编号
    private Integer updated_at;//修改时间
    private Integer created_at;//创建时间
    private Integer deleted_at;//删除时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getSpec() {
        return spec;
    }

    public void setSpec(Integer spec) {
        this.spec = spec;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getDepot() {
        return depot;
    }

    public void setDepot(Integer depot) {
        this.depot = depot;
    }

    public Integer getMerchant() {
        return merchant;
    }

    public void setMerchant(Integer merchant) {
        this.merchant = merchant;
    }

    public Integer getMolecular() {
        return molecular;
    }

    public void setMolecular(Integer molecular) {
        this.molecular = molecular;
    }

    public Integer getAccurate() {
        return accurate;
    }

    public void setAccurate(Integer accurate) {
        this.accurate = accurate;
    }

    public Integer getChem_class_id() {
        return chem_class_id;
    }

    public void setChem_class_id(Integer chem_class_id) {
        this.chem_class_id = chem_class_id;
    }

    public Integer getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public Integer getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Integer deleted_at) {
        this.deleted_at = deleted_at;
    }
}
