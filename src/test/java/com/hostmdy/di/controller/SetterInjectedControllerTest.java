package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.service.impl.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		GreetingServiceImpl greetingServiceImpl = new GreetingServiceImpl();
		setterInjectedController.setGreetingService(greetingServiceImpl);
	}

	@Test
	void GreetingTest() {
		assertEquals(GreetingServiceImpl.GREETING, setterInjectedController.sayHello());
	}

}
