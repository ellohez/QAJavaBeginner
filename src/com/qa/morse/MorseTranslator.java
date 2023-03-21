package com.qa.morse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MorseTranslator {

	Map<String, String> codes = new HashMap<>();

	public MorseTranslator() {
		super();

		this.codes.put(".-", "A");
		this.codes.put("-...", "B");
		this.codes.put("-.-.", "C");
		this.codes.put("-..", "D");
		this.codes.put(".", "E");
		this.codes.put("..-.", "F");
		this.codes.put("--.", "G");
		this.codes.put("....", "H");
		this.codes.put("..", "I");
		this.codes.put(".---", "J");
		this.codes.put("-.-", "K");
		this.codes.put(".-..", "L");
		this.codes.put("--", "M");
		this.codes.put("-.", "N");
		this.codes.put("---", "O");
		this.codes.put(".--.", "P");
		this.codes.put("--.-", "");
		this.codes.put("...", "S");
		this.codes.put("-", "T");
		this.codes.put("..-", "U");
		this.codes.put("...-", "V");
		this.codes.put(".--", "W");
		this.codes.put("-..-", "X");
		this.codes.put("-.--", "Y");
		this.codes.put("--..", "Z");
		this.codes.put(".----", "1");
		this.codes.put("..---", "2");
		this.codes.put("...--", "3");
		this.codes.put("....-", "4");
		this.codes.put(".....", "5");
		this.codes.put("-....", "6");
		this.codes.put("--...", "7");
		this.codes.put("---..", "8");
		this.codes.put("----.", "9");
		this.codes.put("-----", "0");
	}

	public String translate(String morse) {

//		Convert string to string array - split at space or /
		String[] ary = morse.split("\\s+");

		String result = "";
		for (int i = 0; i < ary.length; i++) {
//			System.out.println(i + " : " + ary[i]); For testing
			if (ary[i].contains("/"))
				result += " ";
			else
				result += this.codes.get(ary[i]);
		}

		return result;
	}

	public String toMorse(String plainTxt) {
//		Convert string to string array - split at space or /
		String[] ary = plainTxt.split("");
		String result = "";

//		Get the set of entry pairs <key, value>
		Set<Map.Entry<String, String>> entries = this.codes.entrySet();

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == " ")
				result += " ";
			else {
//				Iterate through the entries searching for the letter
				for (Map.Entry<String, String> entry : entries) {
//					System.out.println(i + " : " + ary[i] + " code: " + entry.getValue()); // For testing
					if (entry.getValue().equals(ary[i]))
//						If letter exists in map, add key (morse code) for that letter
						result += entry.getKey() + " ";
				}
			}
		}

		return result;
	}

}
