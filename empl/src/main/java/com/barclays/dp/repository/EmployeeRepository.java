package com.barclays.dp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.dp.dto.Employee;

@Repository /// the implementation of this interface will be auto 
// generated
public interface EmployeeRepository extends 
JpaRepository<Employee, String> {
	
	
}
