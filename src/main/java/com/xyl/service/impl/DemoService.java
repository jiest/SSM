package com.xyl.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
	
	public List<Map<String, Object>> getData(){
		return demoDao.getData();
	}
	
	public List<Account> getAccountListByAddTime(String addTime){
		return demoDao.getAccountListByAddTime(addTime);
	}
}
