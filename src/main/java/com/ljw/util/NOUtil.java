package com.ljw.util;

import java.util.Date;
import java.util.UUID;

/**
 * @Description:获取商品号
 * @Author Created by liangjunwei on 2018/8/2 12:53
 */
public class NOUtil {
    public static synchronized String getNextGoodsChemAttributeNo(){
        return "SJ"+getNoByUUId();
    }

    private static String getNoByUUId() {
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        return ""+getDateStr().hashCode()+hashCodeV;
    }

    private static String getDateStr() {
        return TimeUtil.format(new Date(), "yyMM");
    }
}
