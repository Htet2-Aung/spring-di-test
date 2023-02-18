package com.hostmdy.di.service.impl;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService{
		
	public static String GREETING = "Hello Greeting";

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return GREETING;
	}
	
	
}
