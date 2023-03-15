package com.qa.classExercises;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	private static Person p1;
	private static Person p2;
	private static Person p3;
	private static List<Person> people;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p1 = new Person("Barry", 40, "Postman");
		p2 = new Person("Gary", 23, "Dock worker");
		p3 = new Person("Larry", 56, "Shop keeper");

		people = new ArrayList<>();

		people.add(p1);
		people.add(p2);
		people.add(p3);

		printPeople();
		printList();

		Person suspect = findPerson("Larry");
		if (suspect != null) {
			System.out.println("Found the suspect");
			System.out.println(suspect.details());
		}

		p1.setAge(122);
		System.out.println(p1.getAge());

		p2.setName("Gordon");
		System.out.println(p2.getName());

		p3.setJobTitle("Doorman");
		System.out.println(p1.getJobTitle());
	}

	static void printList() {

		for (Person p : people) {

			System.out.println(p.details());
		}
	}

	static void printPeople() {

		System.out.println(p1.details());
		System.out.println(p2.details());
		System.out.println(p3.details());
	}

	static Person findPerson(String name) {

		for (int i = 0; i < people.size(); i++) {

			if (people.get(i).getName().equals(name)) {
				System.out.println(people.get(i).toString());
				return people.get(i);
			}
		}
		return null;
	}

}
