package com.intelfast.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelfast.domain.Employee;
import com.intelfast.service.EmployeeService;

@RestController
public class EmployeeRESTServices {
	
	private EmployeeService employeeService;	
	
	@Autowired
	@Qualifier("employeeQueryService")
	void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, 
			value = "/employees/1")
	public Employee index() {
		return employeeService.findEmployeeById(1);
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, 
			value = "/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
}
