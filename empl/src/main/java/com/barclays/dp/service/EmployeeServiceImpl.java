package com.barclays.dp.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.dp.dto.Employee;
import com.barclays.dp.repository.EmployeeRepository;


@Service // it will create a singleton object.

public class EmployeeServiceImpl implements EmployeeService {
	
	// 
	@Autowired // will bring that repo object.
	private EmployeeRepository employeeRepository;

	@Override
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee empl = null;
		try {
			empl = employeeRepository.save(employee);
		} catch (Exception e) {
			System.out.println("problem");
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		if(empl!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		
		try {
			Optional<Employee> optional = employeeRepository.findById(empId);
			
			if(optional.isPresent()) {
				employeeRepository.deleteById(empId);
				return "success";
			}
			else {
				return "fail";
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee> list =  employeeRepository.findAll();
		
		if(list.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(list);
	}

}
