package com.qa.morse;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	Map<String, String> codes = new HashMap<>();

	public MorseTranslator() {
		super();

		this.codes.put(".-", "A");
		this.codes.put("-...", "B");
	}

}
