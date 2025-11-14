package com.tnsif.packages;

public class Person {
	public Person(String name, int age, String city) {
		this.personName = name;
		this.personAge = age;
		this.personCity = city;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	private String personName = "Thanu Prasad";
	protected int personAge = 22;
	private String personCity = "Belur";
	
	public void display() {
		System.out.println("Name: " + personName+ " ," + "Age: "+personAge + " ," +"City: " + personCity);
	}
}
