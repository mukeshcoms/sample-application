package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository("employeeRepository")
public class JpaEmployeeRepository implements EmployeeRepository {

	public List<Employee> getAllEmployee() { 
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setId(300);
		emp.setName("Ramu Kumar");
		
		employees.add(emp);
		return employees;
	}
}
