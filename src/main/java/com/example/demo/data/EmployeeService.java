package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getEmployee(Long eno) {		
		return employeeDao.getEmployee(eno);
	}
	public EmployeeList getAllEmployees() {		
		return employeeDao.getAllEmployees();
	}
	
	public List<Employee> getEmployees() {		
		return employeeDao.getEmployees();
	}
}
