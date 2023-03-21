package com.qa.morse;

import java.util.HashMap;
import java.util.Map;

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

}
