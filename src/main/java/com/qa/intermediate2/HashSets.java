package com.qa.intermediate2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSets {

	
	public static void hashSet() {
	List<String> list = new ArrayList<>();
	Set<String> set = new HashSet<>();
	
	set.add("Cadbury");
	set.add("Kinder");
	set.add("LINDT");
	set.add("Galaxy");
	set.add("Galaxy");//does not allow duplicates
	System.out.println(set);

	set.size();
	set.remove("LINDT");
	
	
	}
}
