package com.qa.rpsgame;

import java.util.Random;

public class RPSGame {

	public boolean playRPS(RPS choice) {

		RPS pcChoice = this.computerChoice();
		System.out.println("Deep thought chose: " + pcChoice);

		return choice == pcChoice;

	}

	private RPS computerChoice() {
		Random rand = new Random();

		int randInt = rand.nextInt(3);

		return RPS.values()[randInt];
	}
}
