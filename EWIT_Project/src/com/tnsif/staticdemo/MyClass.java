package com.tnsif.staticdemo;

public class MyClass {
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println("-------Within Static Block-------");
		srNo=1000;
	}
	
	MyClass()
	{
		System.out.println("-------Within Default Constructor-------");
		srNo=1000;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + " srNo=" + srNo + "]";
	}
	
	static void display() {
		System.out.println("Serial No. "+ srNo);
	}
	
	
	
	
}
