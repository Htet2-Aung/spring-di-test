package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.impl.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController /* = new PropertyInjectedController() */;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyInjectedController = new PropertyInjectedController();
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		propertyInjectedController.greetingService = greetingService;
	} 

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
	}

}
