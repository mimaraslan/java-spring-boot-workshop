package com.mimaraslan.service;

public class MessageProcessorImpl implements MessageProcessor {


	MessageService messageService;
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}


	@Override
	public void processorMsg(String message) {
		System.out.println("MessageProcessorImpl"+ message);
	}

}
