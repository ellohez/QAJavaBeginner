package com.qa.basicPersonClass;

import java.util.Scanner;

public class RPSRunner {
	public static void main(String[] args) {

		RPSGame game = new RPSGame();
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose from " + RPS.ROCK + RPS.PAPER + RPS.SCISSORS);
		System.out.println("Enter 1 for " + RPS.ROCK);
		System.out.println("Enter 2 for " + RPS.PAPER);
		System.out.println("Enter 3 for " + RPS.SCISSORS);

		int uChoice = input.nextInt();
		RPS rpsChoice = RPS.ROCK;
		switch (uChoice) {
		case 1:
			rpsChoice = RPS.ROCK;
		case 2:
			rpsChoice = RPS.PAPER;
		case 3:
			rpsChoice = RPS.SCISSORS;
		}

		System.out.println("You chose: " + rpsChoice + " You win = " + game.playRPS(RPS.PAPER));
	}
}
