package com.barclays.dp;

import java.sql.Connection;

import com.barclays.dp.service.EmployeeService;
import com.barclays.dp.service.EmployeeServiceImpl;
import com.barclays.dp.utils.DBUtils;

public class Main {

	public static void main(String[] args) {
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
		EmployeeService employeeService2 = EmployeeServiceImpl.getInstance();
		
		EmployeeService employeeService3 = EmployeeServiceImpl.getInstance();
		// whenver we will print ref then it will call toString method internally.
		
		System.out.println(employeeService);   // toString method.
		System.out.println(employeeService2);
		System.out.println(employeeService3);
		System.out.println(employeeService.toString());
		
		DBUtils dbUtils= new DBUtils();
		Connection connection = dbUtils.getConnection();
		System.out.println("connection status     "+connection!=null);
		
		
		
		
		
	}
	
}

// Solid Principles
// Factory 
// Builder
// decorator
// adaptor
// strategy
// DB connectivity.

