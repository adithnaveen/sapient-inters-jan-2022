package com.naveen.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getMysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sapientdb", "root", "kanchan@1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; 
		
	}
	
	public static void main(String[] args) {
		System.out.println(getMysql());
	}
	
}
