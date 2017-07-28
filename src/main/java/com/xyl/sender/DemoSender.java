package com.xyl.sender;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoSender {
	
	@Autowired // Ҳ����ע��JmsTemplate��JmsMessagingTemplate��JmsTemplate�����˷�װ  
    private JmsMessagingTemplate jmsTemplate;  
	
	 Destination destination = new ActiveMQQueue("t_Mis_Test");  
	
    // ������Ϣ��destination�Ƿ��͵��Ķ��У�message�Ǵ����͵���Ϣ  
    public void sendMessage(final String message){ 
        System.out.println("�����߷��͵���ϢΪ��"+message);
        jmsTemplate.convertAndSend(destination, message);  
    }  
}
