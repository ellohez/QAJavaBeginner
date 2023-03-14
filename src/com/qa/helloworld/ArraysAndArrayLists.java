package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraysAndArrayLists {

	static int[] nums = new int[20];

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			nums[i] = i + 1;
		}

//		array1();
//		array2();
//		addDigits();
//		System.out.println(intToString());
//		System.out.println(intToStringExtended());

//		arrayListStuff();
		sqOrCube();
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

//	This is a bit of a disaster! With more time, I would rework
	static String intToStringExtended() {

		System.out.println("Please enter a number between 1 - 999: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String[][] intToWord2D = { { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" },
				{ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
						"nineteen" },
				{ "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" } };

		if (input > 0 && input < 20) {
			return intToWord2D[input / 10][input % 10];
		}

		else if (input >= 20 && input < 100) {
			String strNum = "";
			strNum = strNum.concat(intToWord2D[2][input / 10] + " ");
			strNum = strNum.concat(intToWord2D[0][input % 10]);
			return strNum;
		} else if (input >= 100 && input < 1000) {
			String strNum = "";
			strNum = strNum.concat(intToWord2D[0][input / 100] + " hundred and ");
			int remainder = input % 100;
			if (remainder < 20) {
				return strNum.concat(intToWord2D[input / 10][input % 10]);
			} else {
				strNum = strNum.concat(intToWord2D[2][remainder / 10] + " ");
				return strNum.concat(intToWord2D[0][input % 10]);
			}
		} else
			return "Invalid number";
	}

	static void arrayListStuff() {
		List<String> colourList = new ArrayList<>(List.of("Red", "Yellow", "Green"));

//		Add my favourite colour
		colourList.add("Purple");
//		and others...
		colourList.add("Pink");
		colourList.add("Blue");
//		Get index of my favourite colour
//		Boolean inList = colourList.contains("Purple");
		int faveColIndex = colourList.indexOf("Purple");
		System.out.println("Purple is number " + faveColIndex + " in the list");

//		Enhanced for loop
		for (String colour : colourList) {
			System.out.println(colour);
		}

		if (faveColIndex > 0) {
			System.out.println("---First entry is: " + colourList.get(0));
			Collections.swap(colourList, 0, faveColIndex);
//			Where is my favourite colour now?
//			NOTE! Use of indexOf() method not get()
			faveColIndex = colourList.indexOf("Purple");
			System.out.println("---Purple is number " + faveColIndex + " in the list");
		}

//		Sorting using Collections helper methods
		Collections.sort(colourList);
		System.out.println("---Sorted!! ;-) ");

//		Normal for loop
		for (int i = 0; i < colourList.size(); i++) {
			System.out.println("Index " + i + " = " + colourList.get(i));
		}

//		Sorted! in reverse
		System.out.println();
		System.out.println("---Reverse sort---");
		Collections.reverse(colourList);
		for (String colour : colourList) {
			System.out.println(colour);
		}

//		Remove pink
		System.out.println();
		System.out.println("---Remove pink---");
		colourList.remove(colourList.indexOf("Pink"));
		for (String colour : colourList) {
			System.out.println(colour);
		}

//		Change last element
		System.out.println();
		System.out.println("---Change last element");
		colourList.set(colourList.size() - 1, "Orange");

		for (String colour : colourList) {
			System.out.println(colour);
		}
	}

//	static void sqNum() {
//
//		for (int number : nums) {
//			int sqNum = number * number;
//			System.out.println(sqNum);
//		}
//	}

	static void sqNum(int n) {

		int sqNum = n * n;
		System.out.println(sqNum);
	}

	static void cubeNum(int n) {

		int cubeNum = n * n * n;
		System.out.println(cubeNum);
	}

	static boolean isEven(int num) {

		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	static void sqOrCube() {
//	TODO - Using nums array, iterate through using and enhanced for loop
//		if number is even cube and print it
//		else if number is odd, square it and print it. 

		for (int number : nums) {
			if (isEven(number)) {
				System.out.println(number + " cubed is: ");
				cubeNum(number);
			} else {
				System.out.println(number + " squared is: ");
				sqNum(number);
			}
		}
	}

}
