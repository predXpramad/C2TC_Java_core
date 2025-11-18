package com.tnsif.lambdaExpression;

public class NewWay {
	public static void main(String args[]) {
		
		MyCube obj = (no) -> no*no*no;
		
		System.out.println(obj.getCube(3));
		
		// Arithmetic operation
		Operations ops;
		
		ops = (a,b) -> a+b;
		System.out.println(ops.performArithmetic(12, 10));
		
		//palindrome Example
		
		CheckPalindrome<Integer> intPal;
		intPal = (data) -> {
			int rev = 0;
			int no = data;
			while(no != 0) {
				rev = rev*10 +no%10;
				no=no/10;
			}
			if(data ==rev) {
				return true;
			}
			else {
				return false;
			}
				
		};
		int pal = 123321;
		System.out.println("Number {" + pal + "} Palindrome is:" + intPal.checkPalindrome(pal));
		
		
	}

}
