package com.xyl.sender;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoSender {
	
	@Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装  
    private JmsMessagingTemplate jmsTemplate;  
	
	 Destination destination = new ActiveMQQueue("t_Mis_Test");  
	
    // 发送消息，destination是发送到的队列，message是待发送的消息  
    public void sendMessage(final String message){ 
        System.out.println("生产者发送的信息为："+message);
        jmsTemplate.convertAndSend(destination, message);  
    }  
}
