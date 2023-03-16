package com.qa.classExercises;

public class Vehicle {

	private String model = null;
	private int numWheels = 0; // TODO Make this default 4 in car etc
	private String fuelType = null;
	private int mph = 0;

	private double costMOT = 50.00;

	public Vehicle() {

	}

	public Vehicle(String model, int numWheels, String fuelType, int mph) {
		this.setModel(model);
		this.setNumWheels(numWheels);
		this.setFuelType(fuelType);
		this.setMph(mph);
	}

	public double getCostMOT() {
		return costMOT;
	}

	public void setCostMOT(double costMOT) {
		this.costMOT = costMOT;
	}

	public int getMph() {
		return mph;
	}

	public void setMph(int mph) {
		this.mph = mph;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		String details = "Model: " + this.getModel() + " " + "Num wheels: " + this.getNumWheels() + " " + "Fuel type: "
				+ this.getFuelType() + " " + "Mph: " + this.getMph();
		return details;
	}

}
