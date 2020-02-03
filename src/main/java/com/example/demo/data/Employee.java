package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table
@XmlRootElement
public class Employee {

	@Id
	@GeneratedValue
	Long eno;
	String ename;
	
	public Employee() {}
	
	public Employee(Long eno, String ename) {
		this.eno=eno;
		this.ename=ename;				
	}

	
	public Long getEno() {
		return eno;
	}

	public void setEno(Long eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
