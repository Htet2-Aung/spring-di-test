package com.hostmdy.di.service.impl;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
		
	public static String GREETING = "Hello Setter";

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return GREETING;
	}
	
	
}
