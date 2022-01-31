package com.naveen.day7.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class LaptopSorter{

	static Comparator<Laptop> sortByNameAsc = new Comparator<Laptop>() {

		@Override
		public int compare(Laptop o1, Laptop o2) {
			return o1.getLaptopName().compareTo(o2.getLaptopName());
		}
	}; 
	static Comparator<Laptop> sortByNameDesc = new Comparator<Laptop>() {

		@Override
		public int compare(Laptop o1, Laptop o2) {
			return o2.getLaptopName().compareTo(o1.getLaptopName());
		}
	}; 
	
	static Comparator<Laptop> sortByPriceAsc = new Comparator<Laptop>() {
		@Override
		public int compare(Laptop o1, Laptop o2) {
			return (int) (o1.getLaptopPrice() - o2.getLaptopPrice()); 
		}
	}; 
	static Comparator<Laptop> sortByPriceDesc = ( o1,  o2) -> {
			return (int) (o2.getLaptopPrice() - o1.getLaptopPrice()); 
	}; 
}

public class SetEx04 {
	
	public static void main(String[] args) {
		
		Set<Laptop> laptops = new TreeSet<Laptop>(); 
		
		laptops.add(new Laptop(101, "Apple MacBookPro", 2000.0)); 
		laptops.add(new Laptop(102, "Dell - Yoga", 2200)); 
		laptops.add(new Laptop(102, "Dell - Yoga", 2200)); 
		
		for(Laptop temp: laptops) {
			System.out.println(temp +", Stored @ " + temp.hashCode());
		}
		

		Set<Laptop> laptops1 = new TreeSet<Laptop>(LaptopSorter.sortByPriceAsc); 

		laptops1.add(new Laptop(456, "Apple MacBookPro", 2000.0)); 
		laptops1.add(new Laptop(102, "Lenovo", 2200)); 
		laptops1.add(new Laptop(223, "Dell - Yoga", 2100)); 

		System.out.println("--------- Ascending order of name ----------- ");
		
		for(Laptop temp: laptops1) {
			System.out.println(temp +", Stored @ " + temp.hashCode());
		}
	}
}
