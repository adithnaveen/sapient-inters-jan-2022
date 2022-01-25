package com.naveen.day4.exception;

public class ITException02 {
	
	
	
	public static void checkName(String name) throws NameTooShortException {
		if(name.length()<6) {
				throw new NameTooShortException("Name " + name + " is not as per standards");
		}
	}
	
	public static void payIncomeTax(String name, double income, Companies company) throws Exception{
		
		// 1. if name is min 6 chars 
		try {
			checkName(name);
		} catch (NameTooShortException e) {
			e.printStackTrace();
			throw new Exception("Not Processed due to some prob", e);
		}
		
		
		// 2. if company is sapient(SapientSalaryException) 
		// and sal < 20000 sorry / infosys (InfosysSalaryException) sal<15000 sorry
		
	}
	
	public static void main(String[] args) throws Exception{
		payIncomeTax("Nisc", 20000, Companies.SAPIENT);
	}
}
