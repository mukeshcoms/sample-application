package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class JpaEmployeeRepository implements EmployeeRepository {
    
	public List<Employee> getAllEmployee() { 
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Ritesh Kumar");
		
		employees.add(emp);
		return employees;
	}
}
