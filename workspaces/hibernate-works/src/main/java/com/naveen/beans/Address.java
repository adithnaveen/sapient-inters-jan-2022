package com.naveen.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId; 
	private String street; 
	private String city; 
	private int pin; 
	
}
