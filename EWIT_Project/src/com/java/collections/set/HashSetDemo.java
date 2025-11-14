package com.java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet();
		s.add(10);
		s.add(30);
		s.add(null);
		s.add(20);
		
		System.out.println(s);
	}

}
