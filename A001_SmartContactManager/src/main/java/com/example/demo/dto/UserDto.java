package com.example.demo.dto;



import java.util.List;

import jakarta.persistence.*;



public class UserDto {
	
	
	int userId;
	String firstName;
	String lastName;
	String address;
	List<ContactDto> contacts;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ContactDto> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactDto> contacts) {
		this.contacts = contacts;
	}
	
}
