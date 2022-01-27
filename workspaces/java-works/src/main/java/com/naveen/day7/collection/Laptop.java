package com.naveen.day7.collection;

public class Laptop implements Comparable<Laptop> {
	private int laptopId;
	private String laptopName; 
	private double laptopPrice; 
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String laptopName, double laptopPrice) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + "]";
	}



	@Override
	public int hashCode() {
		return this.laptopName.charAt(0); 
	}

	@Override
	public boolean equals(Object obj) {
		Laptop temp = (Laptop) obj; 
		
		return 
				this.laptopId == temp.getLaptopId() && 
				this.laptopName.equals(temp.getLaptopName()) && 
				this.laptopPrice==temp.getLaptopPrice(); 
	}

	@Override
	public int compareTo(Laptop o) {
		return this.laptopId - o.getLaptopId(); 
	}
}
