package com.ljw.base.dao;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * BaseDao,Dao需继承此Dao
 * @author archie2010
 * since 2011-3-3 下午02:52:36
 */
public class BaseDao extends SqlMapClientDaoSupport{
    @Resource(name = "sqlMapClientTemplate")
    private SqlMapClientTemplate sqlMapClientTemplate;
    @PostConstruct
    public void initSqlMapClientTemplate(){
        super.setSqlMapClientTemplate(sqlMapClientTemplate);
    }
}