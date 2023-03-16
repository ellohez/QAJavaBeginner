package com.qa.stretchExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintWizard {

//	List of paint objects
	private List<Paint> paints = new ArrayList<>();

	private Room myRoom = new Room();

//	Set up room
	public double storeRoomDimensions() {
		double width = 0.00;
		double height = 0.00;
		Scanner scan = new Scanner(System.in);

		System.out.println("Room set up");

		for (int i = 1; i < 5; i++) {
			System.out.println("Please enter the width of wall number " + i + " : ");
			width = scan.nextDouble();

			System.out.println("Please enter the height of wall number " + i + " : ");
			height = scan.nextDouble();

			myRoom.addWallArea(width, height);
		}

		return myRoom.getRoomArea();
	}

	public List<Paint> getPaints() {
		return paints;
	}

	public void setPaints(List<Paint> paints) {
		this.paints = paints;
	}

//	TODO - method to calculate the best to buy 
//	given the size of a room (cheapest)

//	TODO - method to calc which paint wastes the least

//	TODO - add paint to array
}
