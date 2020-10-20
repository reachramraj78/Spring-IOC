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
		EmployeeService employeeService = new EmployeeService();
		employeeService.setEmployeeDAO(employeeDAO());
		return employeeService;
	}
	@Bean
	public EmployeeController employeeController() {
		EmployeeController employeeController = new EmployeeController();
		employeeController.setEmployeeService(employeeService());
		return employeeController;
	}

}
