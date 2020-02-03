package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path = "/getemp/{eno}")
	//,produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	public Employee getEmployee(@PathVariable Long eno){		
		return employeeService.getEmployee(eno);
		
	}
	
	@GetMapping(path = "/employeelist")	
	public EmployeeList getAllEmployees(){		
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping(path = "/employees")	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<Employee> getEmployees(){		
		return employeeService.getEmployees();
		
	}
}
