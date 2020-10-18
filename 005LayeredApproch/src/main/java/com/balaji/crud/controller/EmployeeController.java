package com.balaji.crud.controller;

import com.balaji.crud.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void save() {
		System.out.println("Employee Controller Save Called..");
		employeeService.save();
	}

}
