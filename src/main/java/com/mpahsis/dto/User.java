package com.mpahsis.dto;

import java.util.Random;

public class User {
	
	private String userID;
	private String firstName;
	private String lastName;
	private String country;
	private String lannguagesKnown;
	private String gender;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLannguagesKnown() {
		return lannguagesKnown;
	}
	public void setLannguagesKnown(String lannguagesKnown) {
		this.lannguagesKnown = lannguagesKnown;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", lannguagesKnown="
				+ lannguagesKnown + ", gender=" + gender + "]";
	}
	
	public static void main(String[] args) {
		
		Random r1 = new Random(), r2 = new Random();
		
		r1.toString();
		System.out.println(r1.toString().substring(17));
		System.out.println(r2.toString().substring(17));
		 
	}
	
}
