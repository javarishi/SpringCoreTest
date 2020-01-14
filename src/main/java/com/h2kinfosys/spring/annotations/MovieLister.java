package com.h2kinfosys.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MovieLister {
	
	public MovieLister() {
		System.out.println("MovieLister Constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("MovieLister Init Method");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("MovieLister PreDestroy Method");
	}
	
	
	private String latestBlockBuster;

	/**
	 * @return the latestBlockBuster
	 */
	public String getLatestBlockBuster() {
		return latestBlockBuster;
	}

	/**
	 * @param latestBlockBuster the latestBlockBuster to set
	 */
	
	public void setLatestBlockBuster(String latestBlockBuster) {
		this.latestBlockBuster = latestBlockBuster;
	}
}
