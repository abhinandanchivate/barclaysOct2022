package com.barclays.dp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity // ORM : object relational mapping.
// class fields will be mapped with the column from database.
// table will be created by spring data jpa.
@Table(name="empl")
public class Employee {
	
	// if we will not mark any annotation then it willl consider 
	// the it as a column
	// according to the specified data type it will 
	// take relevant data type for the column
	// string ==> varchar.
	

	@Id
	private String emplId;
	@Column(unique = true)
	
	private String empFirstName;
	private String empLastName;
	
	private float empSalary;
	// setter methods : to set the value : will accept the value 
	// as an arg but won't retrun anything
	// getter methods : to get the value : will return the value
	// but won't accept anything.
	
	
	
}
