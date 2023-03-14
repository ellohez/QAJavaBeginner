package com.qa.helloworld;

public class StringManipulation {
	public static void main(String[] args) {

		String quoteDA = "\"In the beginning the Universe was created. "
				+ "This has made a lot of people very angry and been widely regarded as a bad move.\"";
		String nameDA = "Douglas Adams";
		System.out.println("Number of words in: " + nameDA + " = " + numWords(nameDA));
		System.out.println("Number of words in: " + quoteDA + " = " + numWords(quoteDA));

		exercises();
	}

	static int numWords(String text) {
//		Return the number of words
//		use only the length, substring and equals methods
		int count = 0;

		if (text.length() > 0) {
			count = 1;

			for (int i = 0; i < text.length(); i++) {
				String currentChar = text.substring(i, i + 1);

				if (currentChar.equals(" ")) {
					++count;
				}
			}
		}

		return count;
	}

	static void exercises() {

		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";

//		Exercise 1
		String newStr = strTwo.toUpperCase() + ", " + strOne.toUpperCase();
		System.out.println(newStr);

//		Exercise 2

	}

}
