package com.tnsif.generics;

//when when don't know type of element we us "<E>"
public class GenericMethod {
	public <E1> void  displayArrayElements(E[] elements) { 
		for(E e:elements) {
			System.out.println("Element is "+ e);
		}
	}
}
