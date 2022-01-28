package com.naveen.day7.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author naveenkumar
 * @see this program will sohw working of hash map 
 * @since Jan 2022 
 * @version 1.0 
 */
public class MapEx01 {
	/**
	 * 
	 * @param args
	 * @see this is main function 
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("Sneha", 1234); 
		map.put("Nischal", 3322); 
		map.put("Yuvraj", 3311); 
		
		
		System.out.println(map.get("Sneha"));
		System.out.println(map.get("Nischal"));
		
		Set<Entry<String, Integer>> entrySet = map.entrySet(); 
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		// they can only be treated as readonly 
		while(iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next(); 
			System.out.println("Key :" + next.getKey() + ", value " + next.getValue());
		}
	}
}







