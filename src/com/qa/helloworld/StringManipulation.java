package com.qa.helloworld;

public class StringManipulation {
	public static void main(String[] args) {

		String quoteDA = "\"In the beginning the Universe was created. "
				+ "This has made a lot of people very angry and been widely regarded as a bad move.\"";
		String nameDA = "Douglas Adams";

		System.out.println("Number of words in: " + nameDA + " = " + numWords(nameDA));
		System.out.println("Number of words in: " + quoteDA + " = " + numWords(quoteDA));

//		exercises();
//		verticalPrint(quoteDA);
//		reverseVerticalPrint(quoteDA);

		System.out.println(findMessage("Hello World!", "World"));
		System.out.println(findMessage("Hello World!", "World!"));
		System.out.println(findMessage(quoteDA, "Universe was created"));

	}

	static boolean findMessage(String message, String text) {
//		Return true if text is found in message
//		Use only length(), substring() and equals() methods

		int txtLen = text.length();
		int msgLen = message.length();
		String sub = "";

//		Work through the message in chunks of text.length()
		for (int i = 0; i + txtLen <= msgLen; i++) {
			sub = message.substring(i, i + txtLen);
			System.out.println("Substring = " + sub);
			if (sub.equals(text)) {
				return true;
			}
		}

		return false;
	}

	static void reverseVerticalPrint(String text) {
//		Print the words on separate lines in reverse order
//		Use only length(), substring() and equals() methods
		if (text.length() > 0) {

			int endIndex = text.length();
			for (int i = text.length(); i > 0; i--) {
				String currentChar = text.substring(i - 1, i);

				if (currentChar.equals(" ")) {
					System.out.println(text.substring(i, endIndex));
					endIndex = i - 1;
				}
			}
			System.out.println(text.substring(0, endIndex));
		}
	}

	static void verticalPrint(String text) {
//		Print each of the  words on a separate line 
//		Use only length(), substring() and equals() methods
		if (text.length() > 0) {

			int startIndex = 0;
			for (int i = 0; i < text.length(); i++) {
				String currentChar = text.substring(i, i + 1);

				if (currentChar.equals(" ")) {
					System.out.println(text.substring(startIndex, i + 1));
					startIndex = i + 1;
				}
			}
			System.out.println(text.substring(startIndex, text.length()));
		}
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
		String shortStr = newStr.substring(0, newStr.indexOf("SUNNY"))
				+ newStr.substring(newStr.indexOf("RAINING"), newStr.length());
		System.out.println(shortStr);
	}

}
