package com.qa.classExercises;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	private static Person p1;
	private static Person p2;
	private static Person p3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p1 = new Person("Barry", 40, "Postman");
		p2 = new Person("Gary", 23, "Dock worker");
		p3 = new Person("Larry", 56, "Shop keeper");

		printPeople();
		printList();
	}

	static void printList() {

		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		for (int i = 0; i < people.size(); i++) {

			System.out.println(people.get(i).details());
		}
	}

	static void printPeople() {

		System.out.println(p1.details());
		System.out.println(p2.details());
		System.out.println(p3.details());
	}

}
