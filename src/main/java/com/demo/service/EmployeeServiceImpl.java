package com.demo.service;

import java.util.List;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
import com.demo.repository.JpaEmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
   // EmployeeRepository employeeRepository = new JpaEmployeeRepository();
	EmployeeRepository employeeRepository;
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployee() {
		 
		 return employeeRepository.getAllEmployee();
	 }
}
