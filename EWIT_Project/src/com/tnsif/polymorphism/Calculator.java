package com.tnsif.polymorphism;


class calculatorLogic{
	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Calculator {

	public static void main(String[] args) {
		calculatorLogic cal = new calculatorLogic();
		System.out.println(cal.add(5, 6));
		System.out.println(cal.add(5.5, 6));

	}

}


//class car{
//	int type(int ModelNo) {
//		return ModelNo;
//	}
//	String type(String CName) {
//		return CName;
//	}
//	String type(String CName, String Model) {
//		return CName + Model;
//	}
//}