package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 2;
		System.out.println("Sum option TRUE: " + a + " + " + b + " = " + sumMultiply(a, b, true));
		System.out.println("Sum option FALSE: " + a + " * " + b + " = " + sumMultiply(a, b, false));

//		(a > 2000) && (a < 4000) -> A, B, E
		int testNum = 3000;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a > 4000) && (a < 6000) -> A, B, D  
		testNum = 5000;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a > 6000) -> A, C
		testNum = 7000;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a < 100) -> 1, 2
		testNum = 99;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a > 600) && (a < 2000) -> 1, 3, 5
		testNum = 1000;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a > 500) && (a < 600) -> 1, 3, 4, 6
		testNum = 550;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
//		(a > 100) && (a < 500) -> 1, 3, 4, 7
		testNum = 200;
		System.out.println("Test flowchart -> " + testNum);
		conditionalFlowChart(testNum);
	}

//	Should have named this "To sum or not to sum"!!
	static int sumMultiply(int a, int b, boolean sumOption) {
		if (sumOption) {
			return a + b;
		} else {
			return a * b;
		}
	}

	static void conditionalFlowChart(int a) {

		if (a > 2000) {
			System.out.println("A");

			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");

				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");

			if (a > 100) {
				System.out.println("3");

				if (a > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");

					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
}
