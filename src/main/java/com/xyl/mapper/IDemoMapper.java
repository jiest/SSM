package com.xyl.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xyl.bean.Account;

@Mapper
public interface IDemoMapper {
	@Select("select * from account where account_id = #{accountId}")
	Account getAccountById(@Param("accountId")Integer accountId);
	
	@Select("select * from account where account_id IN (1,110)")
	public List<Map<String, Object>> getData();
	
	@Select("select * from account where add_time > #{addTime}")
	public List<Account> getAccountListByAddTime(@Param("addTime")String addTime);
}
