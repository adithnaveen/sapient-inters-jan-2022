package com.naveen.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName; 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	@OrderColumn(name = "type")
	private List<Address> address; 
	
}
