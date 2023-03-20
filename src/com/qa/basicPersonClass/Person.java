package com.qa.basicPersonClass;

public class Person {

	private int age = 0;
	private String name = null;
	private String jobTitle = null;

	public Person() {
	}

	public void setAge(int age) {
//		TODO test age is within sensible limits 
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
//		TODO test name string is sensible input
		this.name = name;
	}

	public String getName() {
//		TODO test name string is sensible input
		return this.name;
	}

	public void setJobTitle(String jobTitle) {
//		TODO test jobTitle is sensible input
		this.jobTitle = jobTitle;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public Person(String name, int age, String jobTitle) {

		this.setAge(age);
		this.setName(name);
		this.setJobTitle(jobTitle);
	}

	public String details() {
		String strDetails = this.name + " is " + this.age + " years old and works as a " + this.jobTitle;
		return strDetails;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.jobTitle;
	}
}
