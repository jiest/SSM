package com.xyl.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xyl.bean.Account;

@Mapper
public interface IDemoMapper {
	@Select("select * from account where account_id = #{accountId}")
	Account getAccountById(@Param("accountId")Integer accountId);
	
	@Select("")
	Map<String, Object> getData();
}
