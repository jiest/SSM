package com.xyl.service;

import com.xyl.bean.Account;

public interface IDemoService extends IBaseService {
	public String getNow();
	
	public Account getAccountById(Integer accountId);
}
