package com.ljw.util;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author Created by liangjunwei on 2018/8/2 17:09
 */
public class TitleUtil {
    public static List<String> getGoodsInfoStrList(){
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
}
