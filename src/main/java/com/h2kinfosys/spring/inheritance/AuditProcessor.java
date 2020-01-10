package com.h2kinfosys.spring.inheritance;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AuditProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AuditProcessor : postProcessBeforeInitialization ::SpringCoreTest :: " + beanName );
		return bean;
	}

	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AuditProcessor :: postProcessAfterInitialization ::SpringCoreTest :: " + beanName );
		return bean;
	}
}
