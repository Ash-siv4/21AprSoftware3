package com.qa.solid;

import com.qa.solid.LSPandDI.Cat;
import com.qa.solid.LSPandDI.Dog;
import com.qa.solid.LSPandDI.Kennel;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog Niko = new Dog("chicken");
		Cat Garfield = new Cat("salmon");

		Kennel.GiveTreatTo(Niko);
		Kennel.GiveTreatTo(Garfield);

	}

}
