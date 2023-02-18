package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.impl.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingServiceImpl = new GreetingServiceImpl();
		constructorInjectedController = new ConstructorInjectedController(greetingServiceImpl);
	}

	@Test
	void GreetingTest() {
		assertEquals(GreetingServiceImpl.GREETING, constructorInjectedController.sayHello());
	}

}
