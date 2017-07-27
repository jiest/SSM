package com.xyl.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xyl.bean.Account;
import com.xyl.dao.IDemoDao;
import com.xyl.mapper.IDemoMapper;

@Repository("demoDao") //被这个注解所修饰的DAO或repositories类会被ComponentScan发现并配置。
public class DemoDao extends BaseDao implements IDemoDao {

	@Autowired
	IDemoMapper demoMapper;
	
	public Account getAccountById(@Param("accountId")Integer accountId){
		return demoMapper.getAccountById(accountId);
	}
	
	
	public List<Map<String, Object>> getData(){
		return demoMapper.getData();
	}
	
	public List<Account> getAccountListByAddTime(String addTime){
		return demoMapper.getAccountListByAddTime(addTime);
	}
}
