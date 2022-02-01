package com.naveen.day10.streams;

public class Trainer {
	private int tId; 
	private String tName; 
	private double tSalary;
	
	public Trainer() {
	}
	
	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", tName=" + tName + ", tSalary=" + tSalary + "]";
	}

	public Trainer(int tId, String tName, double tSalary) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tSalary = tSalary;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public double gettSalary() {
		return tSalary;
	}
	public void settSalary(double tSalary) {
		this.tSalary = tSalary;
	} 
	
	
}
