package com.qa.classExercises;

public class MainVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		Car kia = new Car("Kia", 4, "Unleaded", 80);
		Van transit = new Van("Ford", 4, "Diesel", 60);
		Motorbike harley = new Motorbike("Harley", 2, "Petrol", 120);

		Garage myGarage = new Garage();
		myGarage.add(transit);
		myGarage.add(kia);
		myGarage.add(harley);

		myGarage.printFleet();
	}

}
