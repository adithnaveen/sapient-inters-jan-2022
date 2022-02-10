package com.naveen.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.naveen.beans.Camera;
import com.naveen.beans.Mobile;
import com.naveen.beans.Screen;
import com.naveen.beans.Speaker;
import com.naveen.dao.DummyEmployeeDAO;
import com.naveen.dao.JDBCEmployeeDAO;

@Configuration
@PropertySource("classpath:app-params.properties")
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
	
	@Bean
	public Mobile getMobile() {
		return new Mobile(); 
	}
	
	@Bean
	public Camera camera() {
		return new Camera(); 
	}
	@Bean(name = "speaker")
	public Speaker getSpeaker() {
		return new Speaker();
	}
	
	@Bean
	public Screen screen() {
		return new Screen();   
	}
}
