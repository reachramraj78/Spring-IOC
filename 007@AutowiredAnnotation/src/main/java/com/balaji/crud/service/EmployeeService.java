package com.balaji.crud.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.balaji.crud.dao.AddressDAO;
import com.balaji.crud.dao.DepartmentDAO;
import com.balaji.crud.dao.EmployeeDAO;
import com.balaji.crud.dao.ManagerDAO;

public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private ManagerDAO managerDAO;
	@Autowired
	private DepartmentDAO departmentDAO;

	public void save() {
		System.out.println("Employee Service Save Called..");

		managerDAO.save();
		addressDAO.save();
		departmentDAO.save();
		employeeDAO.save();

	}
}
