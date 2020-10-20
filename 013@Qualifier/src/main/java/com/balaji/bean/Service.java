package com.balaji.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Service {
	@Autowired
	@Qualifier("dao1")
	private Dao dao;
	
	public void getDAO() {
		System.out.println(dao);
	}

}
