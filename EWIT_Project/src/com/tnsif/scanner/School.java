package com.tnsif.scanner;

public class School {
	private static int s;
	private int b;
	private static int a;
	
	public static void m1() {
		//non-static members can't be accessed in static method
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println(b);
		System.out.println(a);
		m1();
	}
	
	static{
		System.out.println("Hi, welcome to your First class.");
	}
	public static void main(String args[]) {
		
		
	}
}
