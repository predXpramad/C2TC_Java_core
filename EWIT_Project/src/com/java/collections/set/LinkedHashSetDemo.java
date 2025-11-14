package com.java.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("India");
		lhs.add("Bengaluru Government");
		lhs.add(null);
		System.out.println(lhs);

	}

}
