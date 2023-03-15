package com.qa.classExercises;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> fleet = new ArrayList<>();

	public Garage() {
		// TODO Auto-generated constructor stub
	}

	public void add(Vehicle brumBrum) {
		fleet.add(brumBrum);
	}

	public void printFleet() {
		for (Vehicle v : fleet) {
			v.toString();
		}
	}
}
