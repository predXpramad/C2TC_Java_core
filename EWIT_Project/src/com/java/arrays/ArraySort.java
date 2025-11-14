package com.java.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String args[]) {
//    	int arr1[]= {110,200,10,40,5};
//		Arrays.sort(arr1);
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
//		System.out.println();
//    	
    	
        int arr2[] = {100, 20, 300, 40, 50, 10, 11, 17, 55, 75};

        for (int i = 0; i < arr2.length - 1; i++) {
            for(int j = 0 ;j < arr2.length - 1 ; j++) {
            	if (arr2[j] > arr2[j + 1]) {
	            	int temp = arr2[j+1];
	                arr2[j+1] = arr2[j];
	                arr2[j] = temp;
	            }
            }	
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}