package com.hostmdy.di.controller;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private  GreetingService greetingService;

	
	public ConstructorInjectedController(@Qualifier(value = "constructorGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
