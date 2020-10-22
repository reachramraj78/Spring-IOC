package com.balaji.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = { "classpath:db.properties" })
public class SpringConfig {

	@Value("${url}")
	private String url;
	@Value("${driver}")
	private String driver;
	@Value("${uname}")
	private String uname;
	@Value("${pass}")
	private String pass;

	@Bean
	public DBConnection dbConnection() {
		DBConnection dbConnection = new DBConnection();
		dbConnection.setDriver(driver);
		dbConnection.setUrl(url);
		dbConnection.setUname(uname);
		dbConnection.setPass(pass);
		return dbConnection;

	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
