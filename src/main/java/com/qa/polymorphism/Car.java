package com.qa.polymorphism;

public class Car extends Vehicle {

	// attributes specified specific to this class
	public int wheels = 4;

	// constructor
	// NOTE: take a look at the difference between the constructors in the car,
	// vehicle and bike classes
	public Car(int speed, String make, boolean auto, int doors, String colour, int wheels) {
		super(speed, make, auto, doors, colour);
		this.wheels = wheels;
	}

	// what is the difference between the above and below constructors?
	public Car(int speed, String make, boolean auto, int doors, String colour) {
		super(speed, make, auto, doors, colour);
		// TODO Auto-generated constructor stub
	}

	// example of overloading
	public int topSpeed(int a) {
		return 12;
	}

	// example of overriding, this method overrides the one in the vehicle class
	@Override
	public int topSpeed() {
		return 100;
	}

}
