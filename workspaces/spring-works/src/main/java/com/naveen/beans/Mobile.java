package com.naveen.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {
	@Autowired
	private Camera camera;
	@Autowired
	private Screen screen;
	@Autowired
	private Speaker speaker;
	 
}
