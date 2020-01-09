package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5_day1.xml");
		
		HelloWorld hello1 = context.getBean("hello", HelloWorld.class);
		System.out.println("Hello 1 " + hello1.getMessage());
		
		HelloWorld hello2 = context.getBean("hello", HelloWorld.class);
		System.out.println("Hello 2 " + hello2.getMessage());
		
		if(hello1.equals(hello2)) {
			System.out.println("Objects are same");
		}
		hello1.setMessage("Hello from Java");
		System.out.println(hello2.getMessage());
		System.out.println(hello2.getLanguage());
		System.out.println(hello2.getCountry().getCountryName());
		context.registerShutdownHook();
		context.close();
	}

}
