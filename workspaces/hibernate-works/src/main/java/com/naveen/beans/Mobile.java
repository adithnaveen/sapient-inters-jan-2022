package com.naveen.beans;

import javax.persistence.Entity;

import lombok.Data;

@Entity
 
public class Mobile extends Product{
	private String type; // featured/ smart  
	private String os; // ios,android,windows 
	private String connectivity; // gsm, cdma 
	
	
	public Mobile(int pId, String pName, String pDesc, Double pPrice, 
			String type, String os, String connectivity) {
		super(pId, pName, pDesc, pPrice);
		this.type = type;
		this.os = os;
		this.connectivity = connectivity;
	}
	
	
}
