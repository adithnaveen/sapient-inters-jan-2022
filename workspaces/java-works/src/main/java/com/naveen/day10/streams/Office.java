package com.naveen.day10.streams;

public class Office {
	private String name; 
	private String country;
	
	public Office() {}
	
	
	
	public Office(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}



	@Override
	public String toString() {
		return "Office [name=" + name + ", country=" + country + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	} 
	
}
