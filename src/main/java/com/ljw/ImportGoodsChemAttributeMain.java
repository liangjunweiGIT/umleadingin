package com.ljw;

import com.ljw.service.InsertGoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description:导入化学试剂商品(二类)
 * @Author Created by liangjunwei on 2018/8/2 10:28
 */
public class ImportGoodsChemAttributeMain {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InsertGoodsService service = context.getBean(InsertGoodsService.class);
        //int i = service.insertGoodsChemAttributeInfo("F:/test.xlsx");
        int i = service.insertGoodsChemAttributeInfo("F:/test.xlsx");
    }

}
