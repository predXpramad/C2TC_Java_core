package com.tnsif.inheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student() {
		super();// used to refer to it's immediate parent class and super keyword is not used in parent class
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
		super(name, aadharNo, address, phno);
		this.collegeName = collegeName;
		this.rollNo= rollNo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
