package com.qa.polymorphism;

public class Vehicle {

	// attributes
	public int speed;
	public String make;
	public boolean auto;
	public int doors;
	public String colour;

	// constructor
	public Vehicle(int speed, String make, boolean auto, int doors, String colour) {
		super();
		this.speed = speed;
		this.make = make;
		this.auto = auto;
		this.doors = doors;
		this.colour = colour;
	}

	// method
	public int topSpeed() {
		return 140;
	}

}
