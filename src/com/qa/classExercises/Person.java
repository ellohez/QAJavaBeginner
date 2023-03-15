package com.qa.classExercises;

public class Person {

	int age = 0;
	String name = null;
	String jobTitle = null;

	public Person() {
	}

	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String details() {
		String strDetails = this.name + " is " + this.age + " years old and works as a " + this.jobTitle;
		return strDetails;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Person findPerson(String ) {
		
	}

}
