package com.balaji.loosecouplinginterface;

public class OracleDriver implements Driver{
	public void getConnection() {
		System.out.println("Oracle Connection Is Created... ");
	}
}
