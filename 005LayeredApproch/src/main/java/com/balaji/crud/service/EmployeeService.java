package com.balaji.crud.service;

import com.balaji.crud.dao.EmployeeDAO;

public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}



	public void save() {
		System.out.println("Employee Service Save Called..");
		employeeDAO.save();
	}
}
