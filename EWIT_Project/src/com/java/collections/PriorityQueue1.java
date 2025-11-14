package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.add("zero");
		pq.add("An");
		pq.add("Core");
		
		
		System.out.println(pq);
		System.out.println("Size : " + pq.size());
		System.out.println("Poll : " + pq.poll());
		
		pq.remove();
		System.out.println(pq);
		System.out.println("Size : " + pq.size());
		
		System.out.println("Poll : " + pq.poll());
	}

}
