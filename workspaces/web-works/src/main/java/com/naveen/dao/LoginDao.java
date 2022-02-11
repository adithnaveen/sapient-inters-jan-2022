package com.naveen.dao;

import com.naveen.beans.Login;

public class LoginDao {
	public boolean loginValidate(Login login) {
		return 
				login.getUserName().equals("sapient") && 
				login.getPassword().equals("india");
	}
}
