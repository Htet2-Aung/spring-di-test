package com.hostmdy.di.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
@Primary
public class PropertyGreetingServiceImpl implements GreetingService{
		
	public static String GREETING = "Hello Propertys";

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return GREETING;
	}
	
	
}
