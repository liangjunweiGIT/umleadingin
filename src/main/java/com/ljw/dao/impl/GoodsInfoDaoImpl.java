package com.ljw.dao.impl;

import com.ljw.dao.GoodsInfoDao;
import com.ljw.domain.GoodsChemAttributeInfo;
import com.ljw.domain.GoodsInfo;
import com.ljw.util.SqlUtil;

public class GoodsInfoDaoImpl implements GoodsInfoDao {

	@Override
	public int insertGoodsChemAttributeInfo(GoodsInfo goodsInfo, GoodsChemAttributeInfo goodsChemAttributeInfo) {
		try {
			SqlUtil.getSqlMapClient().insert("insertGoodsInfo", goodsInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
}
