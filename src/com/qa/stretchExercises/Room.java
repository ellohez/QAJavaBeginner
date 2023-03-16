package com.qa.stretchExercises;

public class Room {

	// Sum of all wall areas
	private double roomArea = 0.0;

	public Room() {
//		Empty room - add dimensions later
	}

	public Room(double area1, double area2, double area3, double area4) {
//		OR create if you know the wall dimensions, 
//		create a room from those 
		this.roomArea = area1 + area2 + area3 + area4;
	}

	public double getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}

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
