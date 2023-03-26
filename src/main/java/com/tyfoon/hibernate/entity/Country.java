package com.tyfoon.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int countryId;
	private String countryName;
	private String CountryZone;
	
	
	public Country() {
		super();
	}
	public Country(int countryId, String countryName, String countryZone) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		CountryZone = countryZone;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryZone() {
		return CountryZone;
	}
	public void setCountryZone(String countryZone) {
		CountryZone = countryZone;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", CountryZone=" + CountryZone
				+ "]";
	}
	
	

}
