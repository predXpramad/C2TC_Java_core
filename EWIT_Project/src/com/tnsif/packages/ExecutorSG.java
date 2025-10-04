package com.tnsif.packages;

public class ExecutorSG {
	public static void main(String args[]) {
		PersonSG p1;
		p1 = new PersonSG();
		
		p1.setPersonName("Thanu Prasad.D");
		p1.setPersonAge(22);
		p1.setPersonCity("Belur");
		
		String name = p1.getPersonName();
		int age = p1.getPersonAge();
		String city = p1.getPersonCity();
		
		System.out.println("The Details of the person are-");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
	}
}
