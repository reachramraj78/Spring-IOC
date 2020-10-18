package com.balaji.bean;

public class Employee {
	
	private int eid;
	private String ename;
	
	private Address address;
	
	
	
	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
	
	

}
