package com.balaji.crud.service;

import com.balaji.crud.dao.AddressDAO;
import com.balaji.crud.dao.DepartmentDAO;
import com.balaji.crud.dao.EmployeeDAO;
import com.balaji.crud.dao.ManagerDAO;

public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	private AddressDAO addressDAO;
	
	private ManagerDAO managerDAO;
	
	private DepartmentDAO departmentDAO;
	
	
	
	



	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}





	public EmployeeService(EmployeeDAO employeeDAO, AddressDAO addressDAO, ManagerDAO managerDAO,
			DepartmentDAO departmentDAO) {
		super();
		this.employeeDAO = employeeDAO;
		this.addressDAO = addressDAO;
		this.managerDAO = managerDAO;
		this.departmentDAO = departmentDAO;
	}





	public void setEmployeeDAOBalaji(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}





	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}





	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}





	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}





	public void save() {
		System.out.println("Employee Service Save Called..");
		
		managerDAO.save();
		addressDAO.save();
		departmentDAO.save();
		employeeDAO.save();
		
	}
}
