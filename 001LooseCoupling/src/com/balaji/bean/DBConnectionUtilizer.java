package com.balaji.bean;

public class DBConnectionUtilizer {

	public static void main(String[] args) {
		MySqlDriver mySqlDriver = new MySqlDriver();
		mySqlDriver.createMySqlConnection();
	}

}
