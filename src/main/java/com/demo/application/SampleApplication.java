package com.demo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class SampleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sample Spring Application!!");
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.getAllEmployee().get(0).getName());
	}

}
