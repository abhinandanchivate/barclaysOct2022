package com.barclays.dp.repository;

import java.util.List;
import java.util.Optional;

import com.barclays.dp.dto.Employee;

public interface EmployeeRepository {
	
	// itss a contract ==> sevral methods ===> to maintain the std.
	
	// whenever the contract is reqd we will inject the contract 
	// by implementing the interface.
	
	public String insertEmployee(Employee employee);
	
	public String deleteEmployee(String empId);
	
	public Optional<Employee> getEmployeeById(String empId);
	// NullPointerException : 
	// optional object : will hold the employee object internally.
	// 
	
	public Optional<List<Employee>> getEmployees();
	// it will provide the all the employee details.
	

}
