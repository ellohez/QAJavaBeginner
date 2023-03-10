package com.qa.helloworld;

import java.text.DecimalFormat;

public class Results {
	static int passMark = 60;
	static int physics = 120;
	static int chemistry = 100;
	static int biology = 90;
	static int total = physics + chemistry + biology;
	static double percentage = 0;

	public static void main(String[] args) {
		printResults();
		percentageResult();
	}

	static void printResults() {
//		total = physics + chemistry + biology;
		System.out.println("--- " + "Biology: " + biology + " ---");
		System.out.println("+++ " + "Chemistry: " + chemistry + " +++");
		System.out.println("*** " + "Physics: " + physics + " ***");
		System.out.println("TOTAL = " + total);
	}

	static void percentageResult() {

		double totalX100 = total * 100;
		percentage = totalX100 / 450;

//		Create nicely formatted decimal percentage
		String percStr = new DecimalFormat("#.##").format(percentage);
//		String percStr = String.format("%2f", percentage);

//		Output the percentage result or fail
		if (percentage >= passMark) {
			System.out.println("PASS (60% or higher)");
		} else {
			System.out.println("FAIL (less than 60%)");
		}
		System.out.println("Overall percentage: " + percStr + "%");
	}
}
