package com.naveen.builder.sql;

public class ImplSqlBuilder {
	public static void main(String[] args) {
		SqlBuilder sqlBuilder = new SqlBuilder(); 
		
		String sql = sqlBuilder
			.from("employees")
			.where("email like ? ", "%gmail%")
			.where("salary > ", 3000)
			.where("city = ", "blr")
			.order("city", "asc")
			.order("salary", "desc")
			.build(); 
		
		System.out.println(sql);
		
	}
}
