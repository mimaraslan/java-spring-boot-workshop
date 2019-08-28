package com.mimaraslan.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	//  http://localhost:8080/sorgu1
	@RequestMapping(value = "/sorgu1")
	public String metot1() {
		System.out.println("metot1");
		return "metot1";
	}
}
