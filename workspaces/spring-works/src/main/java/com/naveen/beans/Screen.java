package com.naveen.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Screen {
	@Value("${mobile.screen.glassType}")
	private String glassType;
	
	@Value("${mobile.screen.len}")
	private int len;
	
	@Value("${mobile.screen.bre}")
	private int bre;
	
	public Screen() {
		System.out.println("Creating Screen " + this);
	}
	 
}
