package com.qa.polymorphism;

public class Bike extends Vehicle{

	// no attributes specified specific to this class

	//constructor
	public Bike(int speed, String make, boolean auto, int doors, String colour) {
		super(speed, make, auto, doors, colour);
		// TODO Auto-generated constructor stub
	}

	//example of overriding, this method overrides the one in the vehicle class
	public int topSpeed() {
		return 50;
		
	}
	

}
