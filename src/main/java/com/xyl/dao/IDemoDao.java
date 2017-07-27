package com.xyl.dao;

import com.xyl.bean.Account;

public interface IDemoDao extends IBaseDao {
	
	public Account getAccountById(Integer accountId);
}
