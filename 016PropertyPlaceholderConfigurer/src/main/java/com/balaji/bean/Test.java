package com.balaji.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DBConnection connection = (DBConnection) context.getBean("dbConnection");
		connection.getConnectionDetails();
	}

}
