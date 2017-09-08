package com.sai;

public class Contact {

	public String name;
	public String number;
	public String email;
	public Contact(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	public Contact(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
