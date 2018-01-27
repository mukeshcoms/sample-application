package com.demo.application;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class SampleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sample Spring Application!!");
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		
		System.out.println(employeeService.getAllEmployee().get(0).getName());
	}

}
