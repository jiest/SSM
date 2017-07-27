package com.xyl.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyl.bean.Account;
import com.xyl.dao.IDemoDao;
import com.xyl.service.IDemoService;

@Service("demoService")
public class DemoService extends BaseService implements IDemoService{

	@Autowired
	IDemoDao demoDao;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public String getNow() {
		return sdf.format(new Date());
	}

	public Account getAccountById(Integer accountId) {
		return demoDao.getAccountById(accountId);
	}
	
	
}
