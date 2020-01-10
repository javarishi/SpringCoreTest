package com.h2kinfosys.spring.autowire;

public class Store {
	
	private DistributionCenter  distributionCenter;
	
	public Store(DistributionCenter  distributionCenter) {
		this.setDistributionCenter(distributionCenter);
	}

	/**
	 * @return the distributionCenter
	 */
	public DistributionCenter getDistributionCenter() {
		return distributionCenter;
	}

	/**
	 * @param distributionCenter the distributionCenter to set
	 */
	public void setDistributionCenter(DistributionCenter distributionCenter) {
		this.distributionCenter = distributionCenter;
	}

}
