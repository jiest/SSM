package com.xyl.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component //此注解相当于把此类放入容器中，此类不属于controller 或者 service 或者 dao
public class DemoListener {
	
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "t_Mis_Test")  
    public void receiveQueue(String text) {  
        System.out.println("消费者收到的报文为:"+text);  
    }  
	
}
