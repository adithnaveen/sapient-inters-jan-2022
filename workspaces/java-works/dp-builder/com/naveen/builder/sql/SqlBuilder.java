package com.naveen.builder.sql;

import java.util.ArrayList;
import java.util.List;

//select * from employee where clause 
public class SqlBuilder {

	private StringBuilder sb = new StringBuilder(1000);
	private boolean orderSpecified = false; 
	private boolean conditionSpecified = false; 
	private List<Object> values = new ArrayList<Object>(); 
	public SqlBuilder() {
	}
	
	public SqlBuilder from(String table) {
		sb.append("select * from ").append(table); 
		return this; 
	}
	
	public SqlBuilder where(String condition, Object value) {
		sb.append(conditionSpecified==false ? " where " :" and ").append(condition);
		
		values.add(value);
		conditionSpecified = true; 
		return this;
	}
	
	public SqlBuilder whereOr(String condition, Object value) {
		sb.append(conditionSpecified==false ? " where " :" or ").append(condition);
		
		values.add(value);
		conditionSpecified = true; 
		return this;
	}
	
	public SqlBuilder order(String orderBy, String field) {
		sb.append(orderSpecified== false ? " order by " : " , ")
		.append(orderBy) 
		.append(" ")
		.append(field); 
		return this;
		
	}
	
	public String build() {
		return sb.toString(); 
	}
	
}
