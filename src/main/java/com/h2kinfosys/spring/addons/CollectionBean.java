package com.h2kinfosys.spring.addons;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	
	private Properties adminEmails;
	private List<String> someList;
	private Map<String,String> someMap;
	private Set<String> someSet;
	/**
	 * @return the adminEmails
	 */
	public Properties getAdminEmails() {
		System.out.println(adminEmails);
		return adminEmails;
	}
	/**
	 * @param adminEmails the adminEmails to set
	 */
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}
	/**
	 * @return the someList
	 */
	public List<String> getSomeList() {
		System.out.println(someList);
		return someList;
	}
	/**
	 * @param someList the someList to set
	 */
	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}
	/**
	 * @return the someMap
	 */
	public Map<String, String> getSomeMap() {
		System.out.println(someMap);
		return someMap;
	}
	/**
	 * @param someMap the someMap to set
	 */
	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}
	/**
	 * @return the someSet
	 */
	public Set<String> getSomeSet() {
		System.out.println(someSet);
		return someSet;
	}
	/**
	 * @param someSet the someSet to set
	 */
	public void setSomeSet(Set<String> someSet) {
		this.someSet = someSet;
	}

}
