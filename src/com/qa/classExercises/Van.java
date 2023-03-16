package com.qa.classExercises;

public class Van extends Vehicle {

	private boolean white = true;
	private int sqMeters = 0;

	public Van() {
		// TODO Auto-generated constructor stub
	}

	public Van(String model, int numWheels, String fuelType, int mph) {
		super(model, numWheels, fuelType, mph);
		// TODO Auto-generated constructor stub
		super.setCostMOT(100.00);
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}

	public int getSqMeters() {
		return sqMeters;
	}

	public void setSqMeters(int sqMeters) {
		this.sqMeters = sqMeters;
	}

}
