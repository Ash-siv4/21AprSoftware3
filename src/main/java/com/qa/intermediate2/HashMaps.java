package com.qa.intermediate2;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps {

	public static void hashmap() {
		//hashmap - key-value
		
		HashMap<String,String> cars = new HashMap<>();
		
		
		cars.put("Ford", "Fiesta");
		cars.put("Nissan", "Micra");
		cars.put("Audi", "S1");
		cars.put("cHEVY", "Camero");
		cars.put("Ford", "Focus");//overwrites previous value

		System.out.println(cars);
		System.out.println(cars.get("Ford"));
		
		cars.remove("cHEVY");
		System.out.println(cars);

//		cars.clear();
		System.out.println(cars.size());
		System.out.println("-----------keys");
		for(String i:cars.keySet()) {
			System.out.println(i);
		}
		System.out.println("-----------values");
		for(String i:cars.values()) {
			System.out.println(i);
		}
		System.out.println("-----------both");
		for(Entry<String,String> i:cars.entrySet()) {
			System.out.println(i);
		}
		
		
	}
	
	
}
