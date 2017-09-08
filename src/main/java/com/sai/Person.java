package com.sai;

public class Person {
private String name;
private String dateOfbirth;
private String mobile;
public Person(String name, String dateOfbirth, String mobile, String aadharNum) {
	super();
	this.name = name;
	this.dateOfbirth = dateOfbirth;
	this.mobile = mobile;
	this.aadharNum = aadharNum;
}

public Person(){
	
}
private String aadharNum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfbirth() {
	return dateOfbirth;
}
public void setDateOfbirth(String dateOfbirth) {
	this.dateOfbirth = dateOfbirth;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAadharNum() {
	return aadharNum;
}
public void setAadharNum(String aadharNum) {
	this.aadharNum = aadharNum;
}
}
