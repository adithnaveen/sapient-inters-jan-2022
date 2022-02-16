package com.naveen.rest.works.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id; 
	private String name; 
	private double income; 
	private String email; 
	
	
}
