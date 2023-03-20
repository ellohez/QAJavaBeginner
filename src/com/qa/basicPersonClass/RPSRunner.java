package com.qa.basicPersonClass;

public class RPSRunner {
	public static void main(String[] args) {

		RPSGame game = new RPSGame();

		System.out.println("You chose: " + RPS.PAPER + " You win = " + game.playRPS(RPS.PAPER));
	}
}
