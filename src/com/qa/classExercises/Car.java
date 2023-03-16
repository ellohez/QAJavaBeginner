package com.qa.classExercises;

public class Car extends Vehicle {

	private int numSeats = 2;
	private boolean hatchback = false;
	private double costMOT = 70.00;

	public Car() {
		super();
	}

	public Car(String model, int numWheels, String fuelType, int mph) {
		super(model, numWheels, fuelType, mph);
	}

	@Override
	public double fixVehicle() {
		return costMOT;
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
