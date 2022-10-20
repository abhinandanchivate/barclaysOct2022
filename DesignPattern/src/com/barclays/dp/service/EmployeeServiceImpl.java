package com.barclays.dp.service;

import java.util.List;
import java.util.Optional;

import com.barclays.dp.dto.Employee;
import com.barclays.dp.repository.EmployeeRepository;
import com.barclays.dp.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	// can u apply singleton DP.
	
	private EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	
	
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static EmployeeService employeeService;
	
	public static EmployeeService getInstance()
	{
		if(employeeService == null)
		{
			System.out.println("inside the if condition from getInstance");
			employeeService = new EmployeeServiceImpl();
		}
		return employeeService;
	}
	
	@Override
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.insertEmployee(employee);
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployee(empId);
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

}
