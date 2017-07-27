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

@Controller 				//@RestController ��Ϊ����������дһ��webӦ�ã����д�����ע�⣬���ע���൱��ͬʱ���@Controller��@ResponseBodyע�⡣
@EnableAutoConfiguration    //���ע������Spring Boot�²� ������ô����Spring����ʵ���ϣ����Ǹ�������ӵ�classpath�е��������жϵ�,
public class DemoController extends BaseController{
	//ע�⣬�Զ����� ������� Starter POMs һ�����������߲�������һ��ġ�����Ȼ���Խ�Starter POMs�е������������ʹ�ã�Spring Boot���ǻ��Զ����á�
	
	@Autowired
	IDemoService demoService;
	
	@Autowired
	DemoSender demoSender;
	
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
		return "���ͳɹ�,��ϢΪ:" + msg;
	}
}
