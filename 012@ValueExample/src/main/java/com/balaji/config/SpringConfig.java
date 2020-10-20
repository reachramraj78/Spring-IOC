package com.balaji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.balaji.bean.Employee;

@Configuration
@ComponentScan(basePackages = {"com.balaji"})
public class SpringConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}

}
