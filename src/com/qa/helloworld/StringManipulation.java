package com.qa.helloworld;

public class StringManipulation {
	public static void main(String[] args) {

		String quoteDA = "\"In the beginning the Universe was created. "
				+ "This has made a lot of people very angry and been widely regarded as a bad move.\"";
		String nameDA = "Douglas Adams";
		System.out.println("Number of words in: " + nameDA + " = " + numWords(nameDA));
		System.out.println("Number of words in: " + quoteDA + " = " + numWords(quoteDA));
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

	static void printVertical(String text) {
//	Given a string, print out the string in a 
//	vertical fashion, each word on a different line.

		int wordIndex = 0;

		for (int i = 0; i < text.length(); i++) {
			String currentChar = text.substring(i, i + 1);
		}

	}

}
