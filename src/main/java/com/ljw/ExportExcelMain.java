package com.ljw;

import com.ljw.util.ExportExcelUtil;
import com.ljw.util.TitleUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

/**
 * @Description: 获取导入模版
 * @Author Created by liangjunwei on 2018/8/2 16:42
 */
public class ExportExcelMain {
    private static final Logger LOGGER = LogManager.getLogger(ExportExcelMain.class.getName());
    public static void main(String[] args) throws IOException {
        String filePath = "F:/化学试剂导入模版"+".xls";
        List<String> goodsInfoStrList = TitleUtil.getGoodsInfoStrList();
        goodsInfoStrList.add("规格");
        goodsInfoStrList.add("货期(时间格式)");
        goodsInfoStrList.add("仓库");
        goodsInfoStrList.add("品牌商户号");
        goodsInfoStrList.add("分子量");
        goodsInfoStrList.add("精确量");
        goodsInfoStrList.add("化学商品种类编号");
        try {
            String modelName = ExportExcelUtil.exportGoodsChemAttributeInfo(goodsInfoStrList,filePath);
            LOGGER.error("已导出添加商品模版:"+modelName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
