package com.qa.classExercises;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> fleet = new ArrayList<>();

	public Garage() {
		// TODO Auto-generated constructor stub
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
		return brum.fixVehicle();
	}

	public double fixAll() {
		double sum = 0.00;
		for (Vehicle v : this.fleet) {
			sum += v.fixVehicle();
		}
		return sum;
	}

	public boolean emptyGarage() {
		fleet = new ArrayList<>();
		return fleet.isEmpty();
	}
}
