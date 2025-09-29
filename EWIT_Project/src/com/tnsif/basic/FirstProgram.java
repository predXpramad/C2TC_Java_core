package com.tnsif.basic;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		Sample s=new Sample();
		Sample s1=new Sample();
		s.a=5;
		s.x=6;
		s.display();
		s.a=7;
		s.x=8;
		s.display();
		
	}

}
