package com.ljw.util;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author Created by liangjunwei on 2018/8/2 17:09
 */
public class TitleUtil {
    private static List<String> getGoodsBaseInfoStrList(){
        List<String> list = new LinkedList<String>();
        list.add("商品名称");
        list.add("图片地址");
        list.add("库存");
        list.add("售价");
        list.add("商品单位");
        list.add("是否热销（0：否；1：是）");
        list.add("品牌分类编号");
        list.add("纯度编号");
        list.add("地域");
        list.add("排序(Num降序)");
        list.add("CAS");
        list.add("自定义属性");
        list.add("SEO优化-标题");
        list.add("SEO优化-关键字");
        list.add("SEO优化-描述");
        return list;
    }

    public static List<String> getGoodsChemAttributeList(){
        List<String> goodsInfoStrList = getGoodsBaseInfoStrList();
        goodsInfoStrList.add("规格");
        goodsInfoStrList.add("货期(时间格式)");
        goodsInfoStrList.add("仓库");
        goodsInfoStrList.add("品牌商户号");
        goodsInfoStrList.add("分子量");
        goodsInfoStrList.add("精确量");
        goodsInfoStrList.add("化学商品种类编号");
        return goodsInfoStrList;
    }

    public static List<String> getChemClassList(){
        List<String> chemClassList = new LinkedList<String>();
        chemClassList.add("二级栏目编号");
        chemClassList.add("名称");
        chemClassList.add("中文别名");
        chemClassList.add("英文名称");
        chemClassList.add("图片");
        chemClassList.add("CAS号");
        chemClassList.add("分子式");
        chemClassList.add("是否热销（0：否；1：是）");
        chemClassList.add("排序（越大越靠前）");
        chemClassList.add("第一属性（品牌分类）编号集");
        chemClassList.add("第二属性（纯度）编号集");
        chemClassList.add("SEO优化-标题");
        chemClassList.add("SEO优化-关键字");
        chemClassList.add("SEO优化-描述");
        return chemClassList;
    }
}
