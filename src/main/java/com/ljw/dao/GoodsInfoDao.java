package com.ljw.dao;


import com.ljw.pojo.GoodsChemAttributeInfo;
import com.ljw.pojo.GoodsInfo;
import com.ljw.vo.ChemClassInfoVO;

import java.util.List;

public interface GoodsInfoDao {

	Integer insertGoodsInfo(GoodsInfo goodsInfo) throws Exception;

	Integer insertGoodsChemAttributeInfo(GoodsChemAttributeInfo goodsChemAttributeInfo) throws Exception;

	List<ChemClassInfoVO> queryAllChemClassInfo();
}
