package com.java.arrays;

//Define a sample class
class Student {
	private  int id;
	private String name;

	Student(int ID, String Name) {
		this.id = ID;
		this.name = Name;
	}	

	@Override
	public String toString() {
		return "Student [Id = " + id + ", Name = " + name + "]";
	}
}

public class ArrayOfObjectsExample {
 public static void main(String[] args) {
     // Declare an array of Student objects
     Student[] students;

     // Allocate memory for 3 Student objects
     students = new Student[3];

     

     // Create and assign Student objects to array elements
     students[0] = new Student(1, "John");
     students[1] = new Student(2, "Jane");
     students[2] = new Student(3, "Mike");
     
     for(int i = 0; i <= students.length-1 ; i++) {
    	 System.out.println(students[i]);
     }
 }

 
}