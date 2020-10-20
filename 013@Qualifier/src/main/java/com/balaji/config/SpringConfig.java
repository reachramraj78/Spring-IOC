package com.balaji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.balaji.bean.Dao;
import com.balaji.bean.Service;

@Configuration
@ComponentScan(basePackages = {"com.balaji"})
public class SpringConfig {
	
	@Bean
	public Service service() {
		return new Service();
	}
	
	@Bean
	public Dao dao1() {
		return new Dao();
	}
	
	@Bean
	public Dao dao2() {
		return new Dao();
	}

}
