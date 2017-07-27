package com.xyl.service;

import java.util.List;
import java.util.Map;

import com.xyl.bean.Account;

public interface IDemoService extends IBaseService {
	public String getNow();
	
	public Account getAccountById(Integer accountId);
	
	public List<Map<String, Object>> getData();
	
	public List<Account> getAccountListByAddTime(String addTime);
}
