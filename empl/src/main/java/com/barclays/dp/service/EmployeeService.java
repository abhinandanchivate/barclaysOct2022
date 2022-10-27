package com.barclays.dp.service;

import java.util.List;
import java.util.Optional;

import com.barclays.dp.dto.Employee;

public interface EmployeeService {
	
public String insertEmployee(Employee employee);
	
	public String deleteEmployee(String empId);
	
	public Optional<Employee> getEmployeeById(String empId);
	// NullPointerException : 
	// optional object : will hold the employee object internally.
	// 
	
	public Optional<List<Employee>> getEmployees();

}
