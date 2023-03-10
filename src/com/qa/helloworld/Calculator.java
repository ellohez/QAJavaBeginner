package com.qa.helloworld;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("1 + 2 = " + add(1, 2));
		System.out.println("1 - 2 = " + subtract(1, 2));
		System.out.println("1 * 2 = " + multiply(1, 2));
		System.out.println("4 / 2 = " + divide(4, 2));
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

}
