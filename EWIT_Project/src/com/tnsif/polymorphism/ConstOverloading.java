package com.tnsif.polymorphism;

class Student{
	String name;
	int age;
	Student(){
		System.out.println(name + " " +age);
	}
	Student(String name){
		this.name = name;
		System.out.println("Name: " + name );
	}
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(name + " " +age);
	}
	
}


public class ConstOverloading {
	public static void main(String args[]) {
		Student s1 = new Student("Thanu");
		Student s2 = new Student("Thanu",22);
		
	}
}
