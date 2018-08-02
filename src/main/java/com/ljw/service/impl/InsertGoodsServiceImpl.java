package com.ljw.service.impl;

import com.ljw.dao.GoodsInfoDao;
import com.ljw.pojo.GoodsChemAttributeInfo;
import com.ljw.pojo.GoodsInfo;
import com.ljw.service.InsertGoodsService;
import com.ljw.util.ImportExcelUtil;
import com.ljw.util.NOUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Author Created by liangjunwei on 2018/8/2 11:01
 */
@Service
public class InsertGoodsServiceImpl implements InsertGoodsService{
    private static final Logger LOGGER = LogManager.getLogger(InsertGoodsService.class.getName());


    @Autowired
    private GoodsInfoDao goodsInfoDao;

    @Transactional
    @Override
    public int insertGoodsChemAttributeInfo(String filePath) {
        File file = new File(filePath);
        List<List<Object>> dataList = null;
        try {
            dataList = ImportExcelUtil.importExcel(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(dataList==null){
            return 0;
        }
        for (int i = 1; i < dataList.size(); i++) {
            System.out.print("正在解析第"+i+"条表格数据:");
            for (int j = 0; j < dataList.get(i).size(); j++) {
                System.out.print(dataList.get(i).get(j)+"  ");
            }
            System.out.println();

            //商品基本属性
            GoodsInfo goodsInfo = new GoodsInfo();
            //TODO 跟随二级栏目号更改
            goodsInfo.setMenuId(4);//电化学实验类
            goodsInfo.setNumber(NOUtil.getNextGoodsChemAttributeNo());

            //化学试剂
            GoodsChemAttributeInfo goodsChemAttributeInfo = new GoodsChemAttributeInfo();

            try {
                LOGGER.error("正在插入第"+i+"条一类条数据:"+goodsInfo.toString());
                Integer goodsId = goodsInfoDao.insertGoodsInfo(goodsInfo);
                if(goodsId==null){
                    LOGGER.error("第"+i+"条一类数据插入失败,全部回滚");
                    throw new RuntimeException("第"+i+"条一类数据插入失败,全部回滚");
                }
                goodsChemAttributeInfo.setGoodsId(goodsId);
                LOGGER.error("正在插入第"+i+"条二类条数据:"+goodsChemAttributeInfo.toString());
                Integer id = goodsInfoDao.insertGoodsChemAttributeInfo(goodsChemAttributeInfo);
                if(id==null){
                    LOGGER.error("第"+i+"条二类数据插入失败,全部回滚");
                    throw new RuntimeException("第"+i+"条二类数据插入失败,全部回滚");
                }
            }catch (Exception e){
                e.printStackTrace();
                return 0;
            }
            System.out.println("------------------------------------------------------");
        }
        LOGGER.error("导入数据完毕,共导入"+(dataList.size()-1)+"条数据!!!!!!!!!!!");
        return dataList.size()-1;
    }
}
