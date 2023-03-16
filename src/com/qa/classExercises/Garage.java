package com.qa.classExercises;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> fleet = new ArrayList<>();

	public Garage() {
		// TODO Auto-generated constructor stub
	}

	public boolean emptyGarage() {

		return false;
	}

	public void add(Vehicle brumBrum) {
		this.fleet.add(brumBrum);
	}

	public void printFleet() {
		for (Vehicle v : this.fleet) {
			System.out.println(v);
		}
	}

	// Remove a vehicle by it's type
	public void removeVehicles(String type) {

		this.fleet.removeIf(vehicle -> vehicle.getClass().getSimpleName().equalsIgnoreCase(type));
	}

	public double fixVehicle(Vehicle brum) {
		return brum.getCostMOT();
	}

	public double fixAll() {

		double sum = 0.00;
		for (Vehicle v : this.fleet) {
			sum += v.getCostMOT();
		}
		return sum;
	}

}
