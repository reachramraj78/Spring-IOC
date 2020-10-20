package com.balaji.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.balaji.crud.controller.EmployeeController;
import com.balaji.crud.dao.EmployeeDAO;
import com.balaji.crud.service.EmployeeService;

@Configuration
public class SpringConfig {
	@Bean
	public EmployeeDAO employeeDAO() {
		return new EmployeeDAO();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}

	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController();
	}

}
