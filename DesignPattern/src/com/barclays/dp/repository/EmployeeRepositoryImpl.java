package com.barclays.dp.repository;

import java.util.List;
import java.util.Optional;

import com.barclays.dp.dto.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	// one object : 
	// to create only one object for ERImpl ===> problem statement
	// singleton Design pattern.
	// Design pattern : are the common solutions for common problems
	// Default constructor.
	
	private EmployeeRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static EmployeeRepository employeeRepository;
	// static : it's one copy will be created 
	// its not associated with your object it will get a separate
	// memory allocation.
	// becomes independant or not.
	
	
	
	public static EmployeeRepository getInstance() {
		// should not be dependant on object ---> static keyword
		/// when we will use static keyword to the method
		// then method becomes independent on the object 
		// for the execution.
		
		if(employeeRepository ==null) {
			// create the object
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		else {
			return employeeRepository;
		}
		// return the object of EmployeeRepositoryImpl
	}
	
	@Override
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
