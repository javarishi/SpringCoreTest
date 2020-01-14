package com.h2kinfosys.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainingTester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("spring5_day4.xml");
		
		SpringTraining training = context.getBean("training", SpringTraining.class);
		//System.out.println(training.getCourseName());
		
		MovieLister movie = context.getBean(MovieLister.class);
		System.out.println(movie.getLatestBlockBuster());
		
		context.close();


	}

}
