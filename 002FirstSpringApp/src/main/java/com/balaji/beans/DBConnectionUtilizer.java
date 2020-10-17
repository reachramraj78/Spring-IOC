package com.balaji.beans;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBConnectionUtilizer {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
		Driver driver = (Driver) context.getBean("driver");
		driver.getConnection();
	}

}
