package com.h2kinfosys.spring.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("spring5_day3.xml");
		
		ChildClass child = context.getBean(ChildClass.class);
		System.out.println(child.getMessageOne());
		System.out.println(child.getMessageTwo());
		System.out.println(child.getMessageThree());
		
		
		context.close();


	}


}
