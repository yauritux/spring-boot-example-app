package com.intelfast.query.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.intelfast.domain.Employee;
import com.intelfast.service.EmployeeService;

@Service("employeeQueryService")
public class EmployeeQueryServiceImpl implements EmployeeService {

	@Override
	public Employee findEmployeeById(int id) {
		
		Employee emp = null;
		switch (id) {
		case 1:
			emp = new Employee();
			emp.setId(1);
			emp.setName("Yauri");
			emp.setPosition("SA");
			break;
		default:
		}
		
		return emp; 
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Yauri", "SA"));
		employees.add(new Employee(2, "Abdi", "SA"));
		return employees;
	}

}
