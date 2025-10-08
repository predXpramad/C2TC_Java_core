package com.tnsif.multiLevelInheritance;

public class State extends Country {
	private String state;
	private String language;
	
	
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(String countryName, String aadharNo, String state, String language) {
		super(countryName, aadharNo);
		this.state = state;
		this.language = language;
		// TODO Auto-generated constructor stub
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [state=" + state + ", language=" + language + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}
