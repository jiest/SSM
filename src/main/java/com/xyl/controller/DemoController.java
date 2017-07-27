package com.xyl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyl.bean.Account;
import com.xyl.sender.DemoSender;
import com.xyl.service.IDemoService;

@Controller 				//@RestController 因为我们例子是写一个web应用，因此写的这个注解，这个注解相当于同时添加@Controller和@ResponseBody注解。
@EnableAutoConfiguration    //这个注解是让Spring Boot猜测 你想怎么配置Spring，但实际上，它是根据你添加到classpath中的依赖来判断的,
public class DemoController extends BaseController{
	//注意，自动配置 可以配合 Starter POMs 一起工作，但二者不是捆绑到一起的。你仍然可以将Starter POMs中的依赖单独拣出使用，Spring Boot还是会自动配置。
	
	@Autowired
	IDemoService demoService;
	
	@Autowired
	DemoSender demoSender;
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)  
	@ResponseBody  
	public String home(){  
		return "你好，Spring Boot";  
	}  
	
	@GetMapping(value="/now")
	@ResponseBody
	public String now(){
		return "现在时间是："+demoService.getNow();
	}

	
	@GetMapping(value="/account")
	@ResponseBody
	public Account getAccountById(@RequestParam("id")Integer accountId){
		return demoService.getAccountById(accountId);
	}
	
	@GetMapping(value="/getData")
	@ResponseBody
	public List<Map<String, Object>> getData(){
		List<Map<String, Object>> data = demoService.getData();
		//System.out.println(data instanceof List);
		return data;
	}
	
 
	@GetMapping(value="/accountList")
	@ResponseBody
	public List<Account> getAccountListByAddTime(@RequestParam("addTime")String addTime){
		return demoService.getAccountListByAddTime(addTime);
	}
	
	
	@GetMapping(value="/sendJMS")
	@ResponseBody
	public String sendJMS(@RequestParam("msg")String msg){
		demoSender.sendMessage(msg);
		return "发送成功,消息为:" + msg;
	}
}
