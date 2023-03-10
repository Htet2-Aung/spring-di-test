package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class MyController {
	
	
	private GreetingService greetingService;
	
	

	public MyController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		System.out.println("Inside My controller Bean");
		return greetingService.sayGreeting();
	}
}
