package com.ljw.service.impl;

import com.ljw.dao.GoodsInfoDao;
import com.ljw.service.QueryGoodsService;
import com.ljw.vo.ChemClassInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author Created by liangjunwei on 2018/8/2 17:45
 */
@Service
public class QueryGoodsServiceImpl implements QueryGoodsService{
    @Autowired
    private GoodsInfoDao goodsInfoDao;

    @Override
    public List<ChemClassInfoVO> queryAllChemClassInfo() {
        return goodsInfoDao.queryAllChemClassInfo();
    }
}
