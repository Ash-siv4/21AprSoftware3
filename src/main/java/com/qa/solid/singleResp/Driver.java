package com.qa.solid.singleResp;

public class Driver {
	private int milesDriven;

	public int getMilesDriven() {
		return milesDriven;
	}

	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}

	// functionality for driving a car is the responsibility of the driver not the car
	public void drive(Car car) {
		car.setMileage(car.getMileage()+this.milesDriven);
	}
	
}
