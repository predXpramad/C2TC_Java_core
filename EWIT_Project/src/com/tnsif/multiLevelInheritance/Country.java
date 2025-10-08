package com.tnsif.multiLevelInheritance;

public class Country {
	private String CountryName;
	private String aadharNo;
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	public Country(String countryName, String aadharNo) {
		this.CountryName = countryName;
		this.aadharNo = aadharNo;
	}
	
	public Country() {
		
	}
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", aadharNo=" + aadharNo + "]";
	}
	
	
}
