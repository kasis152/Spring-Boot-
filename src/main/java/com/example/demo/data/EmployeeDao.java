package com.example.demo.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeDao {

	@Autowired
    EmployeeRepository repository;
	
	List<Employee> employees=new ArrayList<Employee>();
	EmployeeList employeeList=new EmployeeList();
	public EmployeeDao(){
		this.employees.add(new Employee((long)100,"abc"));
		this.employees.add(new Employee((long)101, "xyz"));
		this.employeeList.setEmployees(employees);
	}
	
	public Employee getEmployee(Long eno) {
		//return this.employees.get(1);
		Optional<Employee> employee = repository.findById(eno);
        
        if(employee.isPresent()) {
            return employee.get();
        } else {
            return null;
        }
	}
	public EmployeeList getAllEmployees() {		
		return this.employeeList;
		
	}

	public List<Employee> getEmployees() {
		//return employees;
		return repository.findAll();
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public EmployeeList getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(EmployeeList employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
