package com.barclays.dp.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.dp.dto.Employee;
import com.barclays.dp.service.EmployeeService;

@RestController
// will help us to provide the end point details
// end point are the medium to connect with the server application via rest call.
// it will hold the processing part of your rest app.
// /api/employeee/purpose
// /api/employee/addEmployee
// /api/employee/update
// /api/employee/{id} : it will provide the specific id record
// /api/employee/all : will provide all the records.

@RequestMapping("/api/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/addEmployee") // used for handling post method from http

	public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee) {
		// json object details ====> java object.
		// this is done implicitly by jar : jackson api.
		System.out.println(employee);
		String result;
		try {
			result = employeeService.insertEmployee(employee);
			Map<String, Object> map= new HashMap<>();
			map.put("status", "success");
			map.put("statusCode", 201+"");
			map.put("data",employee);
			return ResponseEntity.status(201).body(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("inside the else part");
			Map<String, Object> map= new HashMap<>();
			map.put("status", "failed");
			map.put("statusCode", 500+"");
			map.put("failure details",e.getMessage());
			// key value ---> json.
			return ResponseEntity.status(500).body(map);
		}
		
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") String id)
	{
		// if id doesn't exists then ?
		
		String result = employeeService.deleteEmployee(id);
		
		if("fail".equals(result)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("record doesn't exists");
		}
		else
		return ResponseEntity.status(HttpStatus.NO_CONTENT)
				.body("record deleted successfully");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") String id){
		
		Optional<Employee> optional = employeeService.getEmployeeById(id);
		
		if(optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("record doesn't exists");
		}
		else
			return ResponseEntity.ok(optional.get());
		// status 200 and body 
	}
	
}
