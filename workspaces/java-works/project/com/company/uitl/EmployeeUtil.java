package com.company.uitl;

import com.company.beans.EmployeeLogin;

public class EmployeeUtil {
	private EmployeeUtil() { }
	public static boolean isValid(EmployeeLogin login) {
		return login.getUserName().length() < 6 || !login.getPassword().contains("@");
	}
}
