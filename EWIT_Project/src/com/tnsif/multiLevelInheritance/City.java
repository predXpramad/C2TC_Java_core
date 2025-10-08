package com.tnsif.multiLevelInheritance;

public class City extends State {
	private String name;
	private String locality;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String countryName, String aadharNo, String state, String language, String name, String locality) {
		super(countryName, aadharNo, state, language);
		this.name = name;
		this.locality = locality;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", locality=" + locality + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
