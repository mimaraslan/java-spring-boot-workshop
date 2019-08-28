package com.mimaraslan.service;

public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("SMSService: "+ message);
	}

}
