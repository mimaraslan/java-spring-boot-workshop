package com.mimaraslan.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


/*
 
 <bean id="smsService" class="com.mimaraslan.service.SMSService"/>


@Bean
public MessageService smsService() {
	return new SMSService();
}
	
 */


@Service(value="SMSService")
public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("SMSService: "+ message);
	}

}
