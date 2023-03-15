package com.qa.classExercises;

public class Car extends Vehicle {

	int numSeats = 2;
	boolean hatchback = false;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, int numWheels, String fuelType, int mph) {
		super(model, numWheels, fuelType, mph);
		// TODO Auto-generated constructor stub
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public boolean isHatchback() {
		return hatchback;
	}

	public void setHatchback(boolean hatchback) {
		this.hatchback = hatchback;
	}

}
