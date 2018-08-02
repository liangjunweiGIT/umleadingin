package com.ljw;

import com.ljw.service.QueryGoodsService;
import com.ljw.util.ExportExcelUtil;
import com.ljw.vo.ChemClassInfoVO;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @Description: 导出全部化学品种类
 * @Author Created by liangjunwei on 2018/8/2 16:42
 */
public class QueryChemClassMain {
    private static final Logger LOGGER = LogManager.getLogger(QueryChemClassMain.class.getName());
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        QueryGoodsService service = context.getBean(QueryGoodsService.class);
        List<ChemClassInfoVO> chemClassInfoList = service.queryAllChemClassInfo();
        String filePath = "F:/化学商品品种类"+".xls";
        try {
            String modelName = ExportExcelUtil.exportAllChemClass(chemClassInfoList,filePath);
            LOGGER.error("已导出全部化学品种类:"+modelName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
