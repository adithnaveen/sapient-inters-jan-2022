package com.naveen.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.naveen.dao.DummyEmployeeDAO;
import com.naveen.dao.JDBCEmployeeDAO;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("in consturctor AppConfig()");
	}
	
	@Lazy
	// by default singleton 
	@Scope("singleton")
	@Bean
	public DummyEmployeeDAO dummyDao() {
		System.out.println("AppConfig.dummyDao() called ");
		return new DummyEmployeeDAO(); 
	}
	@Lazy
	@Bean
	public JDBCEmployeeDAO jdbcDao() {
		System.out.println("AppConfig.jdbcDao() called ");
		return new JDBCEmployeeDAO(); 
	}
}
