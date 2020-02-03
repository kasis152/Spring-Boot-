package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}

/**
 * spring.datasource.url=jdbc:mysql://hk-mysql:3306/test?useSSL=false
spring.datasource.username=root
spring.datasource.password=hellokoding
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

spring.jpa.hibernate.ddl-auto=create
spring.jpa.database-platform=org.hibernate.dialect.MySQL57Dialect
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true
 */
