package com.h2kinfosys.spring.addons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddonTester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext(new String[] {"spring5_day1.xml", "spring5_day2.xml"});
		
		Customer cust = context.getBean(Customer.class);
		System.out.println(cust.getFirstName()+  " " + cust.getLastName());
		
		
		MSWord word = (MSWord) context.getBean("word");
		System.out.println(word.getSpellChecker().getLanguage());
		
		CollectionBean collection = context.getBean("collection", CollectionBean.class);
		collection.getAdminEmails();
		collection.getSomeList();
		collection.getSomeMap();
		collection.getSomeSet();
		
		context.close();
	}

}
