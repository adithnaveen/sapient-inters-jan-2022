package com.naveen.day7.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("Sneha", 1234); 
		map.put("Nischal", 3322); 
		map.put("Yuvraj", 3311); 
		
		
		System.out.println(map.get("Sneha"));
		System.out.println(map.get("Nischal"));
	}
}
