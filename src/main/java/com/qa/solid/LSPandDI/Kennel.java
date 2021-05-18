package com.qa.solid.LSPandDI;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
	
	public List<Animal> animals = new ArrayList<>();
	
	public void add(Animal anim) {
		animals.add(anim);
	}
	

	public static void GiveTreatTo(Animal animal) {
		String msg = "You fed the " + animal.getClass().getSimpleName() + " some " + animal.favoriteFood;
		System.out.println(msg);
	}

}
