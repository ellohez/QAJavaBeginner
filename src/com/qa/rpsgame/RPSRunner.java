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

//		TODO use RPS array to convert int to choice
//		RPS.valueOf(uChoice);
		RPS rpsChoice = RPS.values()[uChoice];

//		This should return a result enum value
		boolean result = game.playRPS(rpsChoice);
		System.out.print("You chose: " + rpsChoice);
		if (result != true && result != false)
			System.out.print(" it was a draw!");
		else
			System.out.println(" You won = " + result);
	}
}
