package com.ljw;

import com.ljw.util.ExportExcelUtil;
import com.ljw.util.TitleUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 获取导入模版
 * @Author Created by liangjunwei on 2018/8/2 16:42
 */
public class ExportExcelMain {
    private static final Logger LOGGER = LogManager.getLogger(ExportExcelMain.class.getName());
    public static void main(String[] args) throws IOException {
        exportChemClass();//导出化学商品种类模版
        exportGoodsChemAttribute();//导出化学试剂模版
    }

    private static void exportChemClass(){
        String filePath = "F:/化学商品种类导入模版"+".xls";
        List<String> chemClassList = TitleUtil.getChemClassList();
        try {
            String modelName = ExportExcelUtil.exportGoodsChemAttributeInfo(chemClassList,filePath);
            LOGGER.error("已导出化学商品种类模版:"+modelName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exportGoodsChemAttribute(){
        String filePath = "F:/化学试剂导入模版"+".xls";
        List<String> goodsInfoStrList = TitleUtil.getGoodsChemAttributeList();
        try {
            String modelName = ExportExcelUtil.exportGoodsChemAttributeInfo(goodsInfoStrList,filePath);
            LOGGER.error("已导出添加商品模版:"+modelName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
