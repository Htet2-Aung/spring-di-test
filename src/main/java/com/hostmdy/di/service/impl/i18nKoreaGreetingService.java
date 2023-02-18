package com.hostmdy.di.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service("i18nGreetingService")
@Profile({"KR","default"})
public class i18nKoreaGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Anyarzinyaw";
	}

}
