package com.balaji.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	@Bean
	@Scope("prototype")
	public Employee employee() {
		return new Employee();
	}

}
