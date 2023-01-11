package com.vaibhav.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.controller.EmployeeController;
import com.vaibhav.model.Employee;
import com.vaibhav.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee emp) {
	//Employee employee = employeeRepository.save(emp);
		logger.info("In the EmployeeSeviceImpl Class");
		return employeeRepository.save(emp);
	}

	
}
