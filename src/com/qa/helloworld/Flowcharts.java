package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {

//		testSumMultiply(); 
//		testConditionalFlowchart();
//		forLoopFlowchartA();
//		forLoopFlowchartB();
//		loopTheLoop();

//		loopTheLoopXtimes();
		coins(4.58, 20.00);
	}

//	Should have named this "To sum or not to sum"!!
	static int sumMultiply(int a, int b, boolean sumOption) {
		if (sumOption) {
			return a + b;
		} else {
			return a * b;
		}
	}

	static void testSumMultiply() {
		int a = 6;
		int b = 2;
		System.out.println("Sum option TRUE: " + a + " + " + b + " = " + sumMultiply(a, b, true));
		System.out.println("Sum option FALSE: " + a + " * " + b + " = " + sumMultiply(a, b, false));
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

	static void testConditionalFlowchart() {

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

	static void forLoopFlowchartA() {

		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}
	}

	static void forLoopFlowchartB() {

		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	static void loopTheLoop() {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(y);
			}
		}
	}

	static void loopTheLoopXtimes() {

		int x = 1;
		for (int i = 1; i <= 10; i++) {
			while (x < (i + 1)) {
				System.out.println(i);
				++x;
			}
			x = 1;
		}
	}

	static void coins(double cost, double amountPaid) {
//		Need test to ensure amountPaid > cost

		double change = 0.00;
		double changeDue = amountPaid - cost;
		int numTwenties = 0;
		int numTenners = 0;
		int numFivers = 0;
		int numPounds = 0;
		int numFiftyPs = 0;
		int numTwentyPs = 0;
		int numTenPs = 0;
		int numFivePs = 0;
		int numTwoPs = 0;
		int numOnePs = 0;

		while (changeDue > 0.00) {
			if (changeDue / 20.00 >= 1) {
				numTwenties += 1;
				change += 20.00;
				changeDue -= 20.00;
			} else if (changeDue / 10.00 >= 1) {
				numTenners += 1;
				change += 10.00;
				changeDue -= 10.00;
			} else if (changeDue / 5.00 >= 1) {
				numFivers += 1;
				change += 5.00;
				changeDue -= 5.00;
			} else if (changeDue / 1.00 >= 1) {
				numPounds += 1;
				change += 1.00;
				changeDue -= 1.00;
			} else if (changeDue / 0.50 >= 1) {
				numFiftyPs += 1;
				change += 0.50;
				changeDue -= 0.50;
			} else if (changeDue / 0.20 >= 1) {
				numTwentyPs += 1;
				change += 0.20;
				changeDue -= 0.20;
			} else if (changeDue / 0.10 >= 1) {
				numTenPs += 1;
				change += 0.10;
				changeDue -= 0.10;
			} else if (changeDue / 0.05 >= 1) {
				numFivePs += 1;
				change += 0.05;
				changeDue -= 0.05;
			} else if (changeDue / 0.02 >= 1) {
				numTwoPs += 1;
				change += 0.02;
				changeDue -= 0.02;
			} else if (changeDue / 0.01 >= 1) {
				numFivePs += 1;
				change += 0.01;
				changeDue -= 0.01;
			}
		}

		System.out.println(numTwenties + " £20");
		System.out.println(numTenners + " £10");
		System.out.println(numFivers + " £5");
		System.out.println(numPounds + " £1");
		System.out.println(numFiftyPs + " 50p");
		System.out.println(numTwentyPs + " 20p");
		System.out.println(numTenPs + " 10p");
		System.out.println(numFivePs + " 5p");
		System.out.println(numTwoPs + " 2p");
		System.out.println(numOnePs + " 1p");
	}
}
