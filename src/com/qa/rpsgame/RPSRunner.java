package com.qa.rpsgame;

import java.util.Scanner;

public class RPSRunner {
	public static void main(String[] args) {

		RPSGame game = new RPSGame();
		Scanner input = new Scanner(System.in);

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

		boolean result = game.playRPS(rpsChoice);
		System.out.print("You chose: " + rpsChoice);
		if (result != true && result != false)
			System.out.print(" it was a draw!");
		else
			System.out.println(" You won = " + result);
	}
}
