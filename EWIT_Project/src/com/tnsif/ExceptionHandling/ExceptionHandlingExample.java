package com.tnsif.ExceptionHandling;

public class ExceptionHandlingExample {
	public static void main (String args[]) {
		int result;
		try {
			result = ExceptionHandlingDemo.performDivision(12,0);
			if(result !=0) {
				System.out.println("Division is :" + result);
			}
			result = ExceptionHandlingDemo.performDivision(12, 3);
			if(result !=0) {
				System.out.println("Division is :" + result);
			}
		}catch(Exception e) {
			System.out.println(ExceptionHandlingDemo.performDivision(12, 4));
			System.out.println("===============================================");
			System.out.println(ExceptionHandlingDemo.performDivision(12f, 15f));
			System.out.println("===============================================");
			System.out.println(ExceptionHandlingDemo.performDivision(12f, 0f));
		}
	}
}
