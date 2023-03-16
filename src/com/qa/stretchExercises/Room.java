package com.qa.stretchExercises;

public class Room {

	// Sum of all wall areas
	private double roomArea = 0.0;

	public double calcWallArea(double w, double h) {
		return w * h;
	}

	public double addWallArea(double width, double height) {
		this.roomArea += calcWallArea(width, height);

		return this.roomArea;
	}

	public double subtractWallArea(double width, double height) {
		this.roomArea -= calcWallArea(width, height);

		return this.roomArea;

	}
}
