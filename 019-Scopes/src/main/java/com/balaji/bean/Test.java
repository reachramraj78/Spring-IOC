package com.balaji.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee1 = (Employee) context.getBean("employee");
		Employee employee2 = (Employee) context.getBean("employee");
		Employee employee3 = (Employee) context.getBean("employee");
		Employee employee4 = (Employee) context.getBean("employee");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
	}

}
