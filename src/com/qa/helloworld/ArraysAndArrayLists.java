package com.qa.helloworld;

import java.util.Scanner;

public class ArraysAndArrayLists {

	public static void main(String[] args) {

//		array1();
//		array2();
//		addDigits();
		System.out.println(intToString());
	}

	static void array1() {

		int[] nums = new int[10];

		for (int x = 0; x < 10; x++) {
			nums[x] = x + 1;
		}

		for (int number : nums) {
			System.out.println(number);
		}
	}

	static void array2() {

		int[] nums = new int[20];
		int newNum = 100;

		for (int i = 0; i < 20; i++) {
			nums[i] = newNum;
			--newNum;
		}

		for (int number : nums) {
			System.out.println(number);
		}
	}

	static void addDigits() {

		System.out.println("Please enter a number between 10 - 99: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		int digit1 = 0;
		int digit2 = 0;
		int result = 0;

		digit1 = input / 10;
		digit2 = input % 10;

		result = digit1 + digit2;

		System.out.println(result);
	}

	static String intToString() {

		System.out.println("Please enter a number between 1 - 99: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String[] numsToTwenty = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "eigteen", "nineteen" };
		String[] numsAboveTwenty = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (input < 20) {
			return numsToTwenty[input];
		} else {
			return numsAboveTwenty[input / 10] + "-" + numsToTwenty[input % 10];
		}
	}

	static String intToStringExtended() {

		System.out.println("Please enter a number between 1 - 999: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String[] numsToTwenty = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "eigteen", "nineteen" };
		String[] numsAboveTwenty = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (input < 20) {
			return numsToTwenty[input];
		} else {
			return numsAboveTwenty[input / 10] + "-" + numsToTwenty[input % 10];
		}
	}
}
