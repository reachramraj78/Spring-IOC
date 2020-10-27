package com.balaji.loosecouplinginterface;

public class MySqlDriver implements Driver{
	
	public void getConnection() {
		System.out.println("MySql Connection Is Created... ");
	}

}
