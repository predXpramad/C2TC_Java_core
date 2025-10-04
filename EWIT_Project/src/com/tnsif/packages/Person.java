package com.tnsif.packages;

public class Person {
	private String personName = "Thanu Prasad";
	protected int personAge = 22;
	private String personCity = "Belur";
	
	public void display() {
		System.out.println("Name: " + personName+ " ," + "Age: "+personAge + " ," +"City: " + personCity);
	}
}
