package com.hostmdy.di.service.impl;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
		
	public static String GREETING = "Hello Constructor";

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return GREETING;
	}
	
	
}
