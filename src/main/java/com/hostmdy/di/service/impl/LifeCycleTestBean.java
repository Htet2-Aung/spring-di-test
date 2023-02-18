package com.hostmdy.di.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("myTestBean")
public class LifeCycleTestBean implements InitializingBean,DisposableBean,BeanNameAware,
		BeanFactoryAware,ApplicationContextAware{
	
	//1
	public LifeCycleTestBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside LifeCycleTestBean Constructor");
	}

	//7
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("###After Property Set");
	}

	
	//10
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LifeCycleBean is destory.");
	}
	
	
	//6
	@PostConstruct
	public void postConstruct() {
		System.out.println("### Post Construct is worked ##");
	}

	//9
	@PreDestroy
	public void preDestroy() {
		System.out.println("### Inside PreDestroy metnod");
	}

	//2
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Set Bean Name: "+name);
	}

	//3
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("###Bean is Set into BeanFactory ###");
	}

	//4
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean is set into application context");
	}
	
	//5
	public void beforeInitialized() {
		System.out.println("## Before Initialized ###");
	}
	
	//8
	public void afterInitialized() {
		System.out.println("## After Initialized ###");
	}
}
