package com.company.beans;

import java.util.List;

public class Trainer {
	private String trainerName; 
	private String trainerAddress; 
	private List<String> trainerTechnologies;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Trainer(String trainerName, String trainerAddress, List<String> trainerTechnologies) {
		super();
		this.trainerName = trainerName;
		this.trainerAddress = trainerAddress;
		this.trainerTechnologies = trainerTechnologies;
	}


	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trainerAddress=" + trainerAddress + ", trainerTechnologies="
				+ trainerTechnologies + "]";
	}


	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	public List<String> getTrainerTechnologies() {
		return trainerTechnologies;
	}
	public void setTrainerTechnologies(List<String> trainerTechnologies) {
		this.trainerTechnologies = trainerTechnologies;
	} 
	
	
}
