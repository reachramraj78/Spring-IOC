package com.balaji.loosecoupling;

import java.io.IOException;
import java.util.Properties;

public class BalajiContainer {
	
	public Object getBean() {
		
		try {
			Properties properties = new Properties();
			properties.load(BalajiContainer.class.getClassLoader().getResourceAsStream("db.properties"));
			Class clz = Class.forName(properties.getProperty("driver"));
			return clz.newInstance();
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
