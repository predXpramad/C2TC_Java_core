package com.tnsif.staticdemo;

public class Employee {
	private String Ename;
	private int id;
	
	static String companyName = "TNS"; //Don't use private when using static

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public Employee(String Ename, int id) {
		this.Ename = Ename;
		this.id = id;
	}
	
	public void show() {
		System.out.println("Name:" + this.Ename + ", ID:" + this.id+ ", Company:"+this.companyName);
	}

	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", id=" + id + "]";
	}
	
	
}
