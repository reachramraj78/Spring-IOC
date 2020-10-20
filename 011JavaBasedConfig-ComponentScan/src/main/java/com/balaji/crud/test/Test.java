package com.balaji.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.balaji.crud.config.SpringConfig;
import com.balaji.crud.controller.EmployeeController;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
	    employeeController.save();
	}

}
