package com.barclays.dp.dto;

import lombok.Data;

@Data
public class Employee {

	private String emplId;
	private String empFirstName;
	private String empLastName;
	
	private float empSalary;
	// setter methods : to set the value : will accept the value 
	// as an arg but won't retrun anything
	// getter methods : to get the value : will return the value
	// but won't accept anything.
	
	
	
}
