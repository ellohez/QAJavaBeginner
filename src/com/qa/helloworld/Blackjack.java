package com.qa.helloworld;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println(playBlackjack(10, 21));
		System.out.println(playBlackjack(20, 18));
		System.out.println(playBlackjack(1, 22));
		System.out.println(playBlackjack(22, 23));

	}

	static int playBlackjack(int a, int b) {

		if (a > 21 && b > 21) {
			return 0;
		}

		if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		}

		return Math.max(a, b);
	}
}
