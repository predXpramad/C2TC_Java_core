package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFDemo {

	public static void main(String[] args) {
		String days[];
		days = new String[7];
		int j = 1;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<days.length;i++) {
			
			System.out.println("Enter the Day "+ j +" of Week" );
			days[i]=sc.nextLine();
			j++;
		}
		j = 1;
		System.out.println("Days of the week are");
		for(int i = 0; i< days.length;i++) {
			System.out.println("The day "+ j +" of Week are : "+ days[i]);
			j++;
		}

		
	}	
}





