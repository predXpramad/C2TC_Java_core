package com.java.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		PriorityQueue<Task> pq  = new PriorityQueue<>();
		
		//Add Task with different priorities
		
		pq.add(new Task("Task 1", 3));
		pq.add(new Task("Task 2", 5));
		pq.add(new Task("Task 3", 2));
		pq.add(new Task("Task 4", 1));
		pq.add(new Task("Task 5", 4));
		
		System.out.println(pq);
		
		//Traverse 
		Iterator i = pq.iterator();
		while (i.hasNext()) {
//			System.out.println(i);
			Task t = (Task) i.next();
			System.out.print(t.getName());
			System.out.print("->");
			System.out.print(t.getPriority());
			System.out.print(" ");
		}
		while(!pq.isEmpty()) {
			System.out.println("Hi");
			Task t = pq.poll();
			System.out.println("Processing Task "+ t.getName() + "->" + t.getPriority());
			
		}
	}

}
