package com.xyl.dao;

import java.util.List;
import java.util.Map;

import com.xyl.bean.Account;

public interface IDemoDao extends IBaseDao {
	
	public Account getAccountById(Integer accountId);
	
	public List<Map<String, Object>> getData();
	
	public List<Account> getAccountListByAddTime(String addTime);
}
