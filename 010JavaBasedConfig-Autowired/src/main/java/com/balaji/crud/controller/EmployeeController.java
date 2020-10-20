package com.balaji.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.balaji.crud.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public void save() {
		System.out.println("Employee Controller Save Called..");
		employeeService.save();
	}

}
