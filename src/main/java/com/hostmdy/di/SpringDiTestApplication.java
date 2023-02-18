package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.ConstructorInjectedController;
import com.hostmdy.di.controller.I18nController;
import com.hostmdy.di.controller.MyController;
import com.hostmdy.di.controller.PropertyInjectedController;
import com.hostmdy.di.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiTestApplication.class, args);
		
//		System.out.println("### My controller ##");
//		MyController myController = (MyController) context.getBean("myController");
//		System.out.println(myController.sayHello());
//		
//		System.out.println("Inside Property Injected COntroller");
//		PropertyInjectedController propertyController = context.getBean(PropertyInjectedController.class);
//		System.out.println(propertyController.sayHello());
//		
//		System.out.println("Inside Setter Injected Controller");
//		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class,"setterInjectedController");
//		System.out.println(setterInjectedController.sayHello());
//		
//		System.out.println("Inside Constructor Injected Controller");
//		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class ,"constructorInjectedController");
//		System.out.println(constructorInjectedController.sayHello());
//		
//		System.out.println("Inside I18nController");
//		I18nController i18nController = (I18nController) context.getBean("i18nController");
//		System.out.println(i18nController.sayHello());
	}

}
