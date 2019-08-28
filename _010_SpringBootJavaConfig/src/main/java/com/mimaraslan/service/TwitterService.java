package com.mimaraslan.service;

public class TwitterService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("TwitterService: "+ message);
	}

}
