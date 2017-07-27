package com.xyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyl.bean.Account;
import com.xyl.service.IDemoService;

@Controller 				//@RestController ��Ϊ����������дһ��webӦ�ã����д�����ע�⣬���ע���൱��ͬʱ���@Controller��@ResponseBodyע�⡣
@EnableAutoConfiguration    //���ע������Spring Boot�²� ������ô����Spring����ʵ���ϣ����Ǹ�������ӵ�classpath�е��������жϵ�,
public class DemoController extends BaseController{
	//ע�⣬�Զ����� ������� Starter POMs һ�����������߲�������һ��ġ�����Ȼ���Խ�Starter POMs�е������������ʹ�ã�Spring Boot���ǻ��Զ����á�
	
	@Autowired
	IDemoService demoService;
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)  
	@ResponseBody  
	public String home(){  
		return "��ã�Spring Boot";  
	}  
	
	@GetMapping(value="/now")
	@ResponseBody
	public String now(){
		return "����ʱ���ǣ�"+demoService.getNow();
	}

	
	@GetMapping(value="/account")
	@ResponseBody
	public Account getAccountById(@RequestParam("id")Integer accountId){
		return demoService.getAccountById(accountId);
	}
	
	
	public static void main(String[] args){  
		SpringApplication.run(DemoController.class, args);  

	}  
}
