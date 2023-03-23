package com.qa.lambda;

public class Runner {

	public static void main(String[] args) {

		CalcInterface add = (a, b) -> a + b;
		System.out.println(add.calculate(10, 10));

		CalcInterface subtract = (a, b) -> a - b;
		System.out.println(subtract.calculate(10, 5));

		CalcInterface multiply = (a, b) -> a * b;
		System.out.println(multiply.calculate(10, 10));

		CalcInterface divide = (a, b) -> a / b;
		System.out.println(divide.calculate(8, 2));
	}
}
