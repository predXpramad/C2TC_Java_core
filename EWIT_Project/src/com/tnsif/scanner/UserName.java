package com.tnsif.scanner;
import java.util.Scanner;

public class UserName {
	public static void main(String args[]) {
		System.out.println("Enter your Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello "+name+", Enter Your Number please!");
		
		long PhoneNum = sc.nextLong();
		System.out.println("Enter the Gender typing F or M");
		char gender = sc.next().charAt(1);
		System.out.println("Gender is "+gender);
		System.out.println("Phone Number: "+PhoneNum);
		
		School s=new School();
		
		
	}

}
