package com.naveen.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Camera {
	@Value("${mobile.camera.type}")
	private String type;

	public Camera() {
		System.out.println("Creating Camera " + this );
	}
	 

}
