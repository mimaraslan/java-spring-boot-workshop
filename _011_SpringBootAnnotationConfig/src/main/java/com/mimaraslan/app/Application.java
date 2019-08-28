package com.mimaraslan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.mimaraslan.service.EmailService;
import com.mimaraslan.service.MessageProcessor;
import com.mimaraslan.service.MessageProcessorImpl;
import com.mimaraslan.service.MessageService;
import com.mimaraslan.service.SMSService;
import com.mimaraslan.service.TwitterService;

@SpringBootApplication
//@ImportResource("classpath*:applicationContext.xml") //XML
//@Configuration //JAVA
public class Application {

	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processorMsg(" CALISAN SERVIS");
		
	}

}
