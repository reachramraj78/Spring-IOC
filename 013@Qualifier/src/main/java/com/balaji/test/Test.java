package com.balaji.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.balaji.bean.Service;
import com.balaji.config.SpringConfig;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service = (Service) applicationContext.getBean("service");
	    service.getDAO();
	}

}
