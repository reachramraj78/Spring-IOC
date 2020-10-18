package com.balaji.bean;

public class Address {
	private int aid;
	private String aloc;
	
	

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + "]";
	}



	public Address(int aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}
	
	

}
