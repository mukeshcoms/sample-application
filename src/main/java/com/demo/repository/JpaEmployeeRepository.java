package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class JpaEmployeeRepository implements EmployeeRepository {
    
	private String name;
	private int id;
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Employee> getAllEmployee() { 
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setId(this.id);
		emp.setName(this.name);
		
		employees.add(emp);
		return employees;
	}
}
