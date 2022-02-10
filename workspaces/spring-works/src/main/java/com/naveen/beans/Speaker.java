package com.naveen.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Speaker {
	
	@Value(value = "mono")
	private String type;
	
	@Value(value = "12")
	private int volLevels;
	
	 public Speaker() {
		 System.out.println("Creating Speaker " + this );
	 }
 
}
