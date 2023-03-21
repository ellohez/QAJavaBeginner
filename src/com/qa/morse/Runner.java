package com.qa.morse;

public class Runner {

	public static void main(String[] args) {

		MorseTranslator translator = new MorseTranslator();
		// Jordan's message :-)
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));

		System.out.println(translator.translate(".... . .-.. . -."));

		System.out.println(translator.toMorse("MATT"));
	}

}
