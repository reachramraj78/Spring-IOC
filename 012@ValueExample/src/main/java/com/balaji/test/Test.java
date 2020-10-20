package com.balaji.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.balaji.bean.Employee;
import com.balaji.config.SpringConfig;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = (Employee) applicationContext.getBean("employee");
	    System.out.println(employee);
	}

}
