package com.qa.classExercises;

public class Motorbike extends Vehicle {

	boolean cruiser = false;
	String seatType = null;

	public Motorbike() {
		// TODO Auto-generated constructor stub
	}

	public Motorbike(String model, int numWheels, String fuelType, int mph) {
		super(model, numWheels, fuelType, mph);
		// TODO Auto-generated constructor stub
	}

	public boolean isCruiser() {
		return cruiser;
	}

	public void setCruiser(boolean cruiser) {
		this.cruiser = cruiser;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

}
