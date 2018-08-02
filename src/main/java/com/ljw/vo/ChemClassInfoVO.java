package com.ljw.vo;

import com.ljw.pojo.ChemClassInfo;

/**
 * @Description:化学商品种类VO
 * @Author Created by liangjunwei on 2018/8/2 17:39
 */
public class ChemClassInfoVO extends ChemClassInfo{
    private String menuName;//二级栏目名称

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
