package com.balaji.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.balaji.crud.controller.EmployeeController;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("empCon");
	    employeeController.save();
	}

}
