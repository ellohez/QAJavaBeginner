package com.qa.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		List<Integer> nums = List.of(2, 3, 4, 5);
		List<String> names = List.of("Michael", "Dean", "James", "Chris");

//		Standard stream using forEach
		names.stream().forEach(x -> System.out.println("Hello " + x));
		names.stream().filter(str -> str.equals("James")).collect(Collectors.toList());

//		Adding filter
//		List<String> result = names.stream().filter(forEach(x -> System.out.println("Hello " + x)));
	}
}
