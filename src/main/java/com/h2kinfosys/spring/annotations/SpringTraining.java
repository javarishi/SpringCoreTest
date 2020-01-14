package com.h2kinfosys.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringTraining {
	
	private String  courseName;
	private int coureDurationinDays;
	private String instructorName;

	@Autowired
	public SpringTraining(String instructorName) {
		this.instructorName = instructorName;
	}
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the coureDurationinDays
	 */
	public int getCoureDurationinDays() {
		return coureDurationinDays;
	}
	/**
	 * @param coureDurationinDays the coureDurationinDays to set
	 */
	public void setCoureDurationinDays(int coureDurationinDays) {
		this.coureDurationinDays = coureDurationinDays;
	}
	/**
	 * @return the instructorName
	 */
	public String getInstructorName() {
		return instructorName;
	}
	/**
	 * @param instructorName the instructorName to set
	 */

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
