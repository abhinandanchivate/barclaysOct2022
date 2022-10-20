package com.barclays.dp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	//singleton impl
	
	public Connection getConnection() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_tracker",
					"root", "root@123");
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// jdbc : protocol : will inform that here we are goign to perform the DB connectivity.
				// mysql: subprotocol : 
				// localhost: since we are using the MYSQL from our local machine. 
				// 3306 : port number for comm.
				// employee_management_tracker : name of the database.
		return null;
				
	}
	
	public void closeConnection(Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Department : deptId, deptName, location
	// DepartmentRepository: 
	// DepartmentService :
	
	
}
