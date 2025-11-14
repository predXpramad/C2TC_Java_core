package com.tnsif.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {
	public static void main(String [] args) {
		LinkedList L = new LinkedList (); //non generic dynamic binding/loose coupled
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(null);
		L.add("Hi");
		
		L.removeFirst();
		ListIterator li = L.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		L.addLast(22.2f);
		System.out.println(L);
		
		
//		L = new ArrayList();
//		L = new LinkedList<>();
//		L = new Vector();
//		Vector v= new Stack();
	}
}
