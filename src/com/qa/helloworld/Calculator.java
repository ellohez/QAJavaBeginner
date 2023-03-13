package com.qa.helloworld;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("1 + 2 = " + add(1, 2));
		System.out.println("1 - 2 = " + subtract(1, 2));
		System.out.println("1 * 2 = " + multiply(1, 2));
		System.out.println("4 / 2 = " + divide(4, 2));
		System.out.println(uniqueSum());
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static double divide(double a, double b) {
		if (a >= b) {
			System.out.println("Error: a must be smaller than b");
			return 0.0;
		}
		return a / b;
	}

	static int uniqueSum() {

		System.out.println("Please enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.println("Please enter a second number: ");
		int b = scan.nextInt();

		System.out.println("Please enter a third number: ");
		int c = scan.nextInt();

		if (a == b && b == c) {
			return 0;
		} else if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a + b + c;
		}
	}

}
