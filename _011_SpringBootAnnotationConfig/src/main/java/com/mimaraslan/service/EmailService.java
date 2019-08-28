package com.mimaraslan.service;

import org.springframework.stereotype.Service;

@Service(value="EmailService")
public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("EmailService: "+ message);
	}

}
