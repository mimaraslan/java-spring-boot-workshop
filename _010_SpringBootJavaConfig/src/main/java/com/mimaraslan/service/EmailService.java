package com.mimaraslan.service;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("EmailService: "+ message);
	}

}
