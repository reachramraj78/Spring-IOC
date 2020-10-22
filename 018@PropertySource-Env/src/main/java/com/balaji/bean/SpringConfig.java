package com.balaji.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:db.properties" })
public class SpringConfig {
	@Autowired
	private Environment env;
	

	@Bean
	public DBConnection dbConnection() {
		DBConnection dbConnection = new DBConnection();
		dbConnection.setDriver(env.getProperty("db.driver"));
		dbConnection.setUrl(env.getProperty("db.url"));
		dbConnection.setUname(env.getProperty("db.uname"));
		dbConnection.setPass(env.getProperty("db.pass"));
		return dbConnection;

	}

	
}
