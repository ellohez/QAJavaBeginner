package com.qa.classExercises;

public class MainVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		Car kia = new Car("Kia", 4, "Unleaded", 80);
		Van transit = new Van("Ford", 4, "Diesel", 60);
		Van camper = new Van("VW", 4, "Diesel", 55);
		Motorbike harley = new Motorbike("Harley", 2, "Petrol", 120);

		Garage myGarage = new Garage();
		myGarage.add(transit);
		myGarage.add(camper);
		myGarage.add(kia);
		myGarage.add(harley);

		System.out.println("Look at all my shiny vehicles");
		myGarage.printFleet();

		System.out.println("Sold all my vans...");
		myGarage.removeVehicles("Van");

		myGarage.printFleet();

		System.out.println("Sent the Harley to be fixed");
		System.out.println("Bill: £" + myGarage.fixVehicle(harley));
		System.out.println("Sent the kia to be fixed");
		System.out.println("Bill: £" + myGarage.fixVehicle(kia));

		System.out.println("Fix all vehicles: ");
		System.out.println("Bill: £" + myGarage.fixAll());

		if (myGarage.emptyGarage()) {
			System.out.println("I hate cars");
			myGarage.printFleet();
			System.out.println("sold them all!");
		}

//		VehiceContainer is a generic that takes any type of object as 
//		that inherits from Vehicle
		VehicleContainer<Motorbike> bikeStore = new VehicleContainer<>();

		bikeStore.setVehicle(harley);
		Motorbike v = bikeStore.getVehicle();
		System.out.println("My bike: " + v);

//		Also valid to use Vehicle still 
		VehicleContainer<Vehicle> store = new VehicleContainer<>();
		store.setVehicle(kia);
		Vehicle v1 = store.getVehicle();
		System.out.println("Vehicle: " + v1 + "Fixed for " + v1.fixVehicle());
		System.out.println(v1.getClass().getSimpleName());

//		As VehicleContainer only takes any type that extends Vehicle
//		The statement below does not compute.
//		VehicleContainer<String s> testStore = new VehicleContainer<>();
	}

}
