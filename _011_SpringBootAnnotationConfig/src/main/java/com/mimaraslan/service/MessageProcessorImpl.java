package com.mimaraslan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="MessageProcessor")
public class MessageProcessorImpl implements MessageProcessor {


	@Autowired
	//@Inject
	@Qualifier(value="EmailService")
	MessageService messageService;
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}


	@Override
	public void processorMsg(String message) {
		System.out.println("MessageProcessorImpl"+ message);
	}

}
