package com.naveen.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;

//this is default strategy 
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy = InheritanceType.JOINED)

@Entity
@Data
@AllArgsConstructor
public class Product {
	@Id
	private int pId; 
	private String pName; 
	private String pDesc; 
	private Double pPrice; 
}
