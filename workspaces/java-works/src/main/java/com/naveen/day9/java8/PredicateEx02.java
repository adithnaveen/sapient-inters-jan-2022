package com.naveen.day9.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Account {
	private int accId; 
	private String custName; 
	private double balance; 
	private String sex;
	
	public Account(int accId, String custName, double balance, String sex) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", balance=" + balance + ", sex=" + sex + "]";
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	} 
	
	
}

public class PredicateEx02 {
	public static void main(String[] args) {
		
		List<Account> accountList = Arrays.asList(
				new Account(123, "Sneha", 1234, "female"), 
				new Account(56, "Chetan", 2211, "male"), 
				new Account(55, "Rahul", 3322, "male"), 
				new Account(88, "Yuvraj", 4321, "male"), 
				new Account(12, "Ayushi", 4455, "female"), 
				new Account(442, "Ojaswi", 3366, "female"),
				new Account(443, "Kushal", 3366, "male")
				); 
		
		// get all the list of males 
		
		List<Account> accOnlyMale =
			AccountPredicate.filterAccounts(accountList, AccountPredicate.onlyMale());
		
		System.out.println("----- only males-------- ");
		accOnlyMale.forEach(System.out :: println);
		
		// get all list of female (Negate Male) 
		List<Account> accOnlyFemale = AccountPredicate.filterAccounts
				(accountList,  AccountPredicate.onlyMale().negate());
		
		System.out.println("----- only females(negate)-------- ");
		accOnlyFemale.forEach(System.out :: println);
		
		// get all the customers with balance above 3000 
		List<Account> onBalanceList = 
			AccountPredicate.filterAccounts(accountList, AccountPredicate.onBalance(3000));
		System.out.println("----- on balance -------- ");
		onBalanceList.forEach(System.out :: println);
		
		// get all customers who are female + balance is more than 3500 
		
		 Predicate<Account> femaleAndBalance2 = AccountPredicate.onlyMale().negate().
		 	and(AccountPredicate.onBalance(3500));
		 
		 List<Account> femaleAndBalaceList =
				 	AccountPredicate.filterAccounts(accountList, femaleAndBalance2);
		 
		 System.out.println("----- femaleAndBalaceList -------- ");
		 femaleAndBalaceList.forEach(System.out :: println);
		 
		 
		 
		 // working with comparator new functions with java 8 
		 // sorting in ascending order on custname 
		 System.out.println("----- ascending order cust name -------- ");
		 accountList.sort( Comparator.comparing(Account :: getCustName));
		 accountList.forEach(System.out :: println);
		
		 // sort on balance then on name 
		 
		 Comparator<Account> balanceAndNameSort = 
				 Comparator.comparing(Account :: getBalance).thenComparing(
				 Comparator.comparing(Account :: getCustName)); 
		 
		 accountList.sort(balanceAndNameSort);
		 System.out.println("---- first on balance then on name ------ ");
		 accountList.forEach(System.out :: println);
		 
		 
	}
	
	static class AccountPredicate {
		public static Predicate<Account> onlyMale() {
			return a -> a.getSex().equals("male"); 
		}
		public static Predicate<Account> onBalance(double balance) {
			return a -> a.getBalance() >  balance;
		}
		
		public static List<Account> filterAccounts(List<Account> accounts,
					Predicate<Account> predicate) {
			return accounts.stream().filter(predicate).collect(Collectors.toList()); 
		} 
	} 
	
}



















