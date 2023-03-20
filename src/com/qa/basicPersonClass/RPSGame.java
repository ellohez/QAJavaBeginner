package com.qa.basicPersonClass;

import java.util.Random;

public class RPSGame {

	public boolean playRPS(RPS choice) {
		return choice == this.computerChoice();

	}

	private RPS computerChoice() {
		Random rand = new Random();

		int randInt = rand.nextInt(150);
		if (randInt < 50)
			return RPS.PAPER;
		else if (randInt > 50 && randInt < 100)
			return RPS.SCISSORS;
		else
			return RPS.ROCK;
	}
}
