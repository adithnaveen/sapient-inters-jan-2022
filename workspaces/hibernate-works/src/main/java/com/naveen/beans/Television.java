package com.naveen.beans;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data

public class Television extends Product{
	private int size; 
	private String screenType;  // CRT/LCD/LED
	private String resolution; // 1024x786, 
	
	public Television(int size, String screenType, String resolution, 
			int pId, String pName, String pDesc, Double pPrice) {
		super(pId, pName, pDesc, pPrice); 
		this.size = size;
		this.screenType = screenType;
		this.resolution = resolution;
	}
	
	
	
}
