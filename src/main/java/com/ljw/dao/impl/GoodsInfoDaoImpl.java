package com.ljw.dao.impl;

import com.ljw.base.dao.BaseDao;
import com.ljw.dao.GoodsInfoDao;
import com.ljw.pojo.GoodsChemAttributeInfo;
import com.ljw.pojo.GoodsInfo;
import com.ljw.vo.ChemClassInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GoodsInfoDaoImpl extends BaseDao implements GoodsInfoDao {

	@Override
	public Integer insertGoodsInfo(GoodsInfo goodsInfo) throws Exception {
		return (Integer)getSqlMapClientTemplate().insert("insertGoodsInfo", goodsInfo);
	}

	@Override
	public Integer insertGoodsChemAttributeInfo( GoodsChemAttributeInfo goodsChemAttributeInfo) throws Exception {
		return (Integer)getSqlMapClientTemplate().insert("insertGoodsChemAttributeInfo", goodsChemAttributeInfo);
	}

	@Override
	public List<ChemClassInfoVO> queryAllChemClassInfo() {
		return getSqlMapClientTemplate().queryForList("queryAllChemClassInfo");
	}

}
