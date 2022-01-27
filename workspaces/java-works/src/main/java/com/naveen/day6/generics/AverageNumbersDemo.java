package com.naveen.day6.generics;


// the below code does not work as T type cannot be generically down
// casted to double 
/*
class Stats<T> {
	private T [] nums; // we can store array of number of type T 

	public Stats(T[] nums) {
		super();
		this.nums = nums;
	}
	
	double average() {
		double sum = 0.0; 
		for(int i=0; i<nums.length; i++) {
//			sum = sum + nums[i].doubleValue(); this line causes compile time error  
		}
	}
	
}
*/

class Stats<T extends Number> {
	private T [] nums; //this is guranteed that nums will be only of type number or child of it 
	public Stats(T[] nums) {
		super();
		this.nums = nums;
	}
	
	double average() {
		double sum = 0.0; 
		for(int i=0; i<nums.length; i++) {
			sum += nums[i].doubleValue();  
		}
		return sum / nums.length; 
	}
	// write a method to check the average of two instances are same of 
	// stats class 
	boolean sameAverage(Stats<?> ob) {
		return average() == ob.average();
	}
} 
public class AverageNumbersDemo {
	public static void main(String[] args) {
		Stats<Integer> intArr = new Stats(new Integer[] {1,2,4,5,1,8});
		double average = intArr.average();
		System.out.println("Average is " + average);
		
		Stats<Double> doubleArr = new Stats(new Double[] {4.0,2.0,4.0,5.0,1.0,8.0}); 
		double average2 = doubleArr.average();
		System.out.println("Double Average is " + average2);
		
		System.out.println(intArr.sameAverage(doubleArr)?"Same":"Not Same");
	}
}










