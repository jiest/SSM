package com.xyl.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component //��ע���൱�ڰѴ�����������У����಻����controller ���� service ���� dao
public class DemoListener {
	
    // ʹ��JmsListener���������߼����Ķ��У�����text�ǽ��յ�����Ϣ  
    @JmsListener(destination = "t_Mis_Test")  
    public void receiveQueue(String text) {  
        System.out.println("�������յ��ı���Ϊ:"+text);  
    }  
	
}
