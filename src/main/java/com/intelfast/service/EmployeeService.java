package com.intelfast.service;

import java.util.List;

import com.intelfast.domain.Employee;

public interface EmployeeService {

	Employee findEmployeeById(int id);
	
	List<Employee> findAll();
}
