package com.vaibhav.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.model.Employee;
import com.vaibhav.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);
	
	//inject employeeService reference
	
	@Autowired
	private EmployeeService employeeService;
	
	//design Restful web service to save the employee data into database
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		logger.info("In the EmployeeController Class");
		System.out.println("some changes have been made");
		System.out.println("Changes for the second time");
		return ResponseEntity.ok().body(emp);
		
	}
	
	
	

}
