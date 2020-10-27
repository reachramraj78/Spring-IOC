package com.balaji.loosecouplinginterface;

public class DBConnectionUtilizer {

	public static void main(String[] args) {
		Driver driver = new OracleDriver();
		driver.getConnection();
	}

}
