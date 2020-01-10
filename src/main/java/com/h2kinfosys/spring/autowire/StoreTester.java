package com.h2kinfosys.spring.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreTester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("spring5_day3.xml");
		
		Store store = context.getBean(Store.class);
		System.out.println(store.getDistributionCenter().getDcNumber());
		System.out.println(store.getDistributionCenter().getDcType());
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp.getEmpId());
		
		context.close();


	}

}
