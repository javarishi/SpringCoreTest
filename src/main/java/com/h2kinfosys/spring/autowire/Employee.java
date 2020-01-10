package com.h2kinfosys.spring.autowire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	private String empId;

	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee :: InitializingBean :: afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("Employee :: DisposableBean :: destroy");
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
