package com.java.collections;

public class Task implements Comparable<Task>{

	private String name;
	private int priority;
	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public int compareTo(Task o) {
		
		return Integer.compare(this.priority, o.priority);
	}

}
