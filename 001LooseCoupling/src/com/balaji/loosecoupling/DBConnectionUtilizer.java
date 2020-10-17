package com.balaji.loosecoupling;

public class DBConnectionUtilizer {

	public static void main(String[] args) {
		BalajiContainer container = new BalajiContainer();
		Driver driver = (Driver) container.getBean();
		driver.getConnection();
	}

}
