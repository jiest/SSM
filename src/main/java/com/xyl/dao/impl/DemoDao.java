package com.xyl.dao.impl;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xyl.bean.Account;
import com.xyl.dao.IDemoDao;
import com.xyl.mapper.IDemoMapper;

@Repository("demoDao") //�����ע�������ε�DAO��repositories��ᱻComponentScan���ֲ����á�
public class DemoDao extends BaseDao implements IDemoDao {

	@Autowired
	IDemoMapper demoMapper;
	
	public Account getAccountById(@Param("accountId")Integer accountId){
		return demoMapper.getAccountById(accountId);
	}
	
	public Map<String, Object> getData(){
		return demoMapper.getData();
	}
}
