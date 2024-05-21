package com.model;

public class EmployeeRegistrationForm {
	String Name;
	String Mail_Id;
	String PhoneNumber;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMail_Id() {
		return Mail_Id;
	}

	public void setMail_Id(String mail_Id) {
		Mail_Id = mail_Id;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeeRegistrationForm [Name=" + Name + ", Mail_Id=" + Mail_Id + ", PhoneNumber=" + PhoneNumber
				+ ", getName()=" + getName() + ", getMail_Id()=" + getMail_Id() + ", getPhoneNumber()="
				+ getPhoneNumber() + "]";
	}

	public EmployeeRegistrationForm(String name, String mail_Id, String phoneNumber) {
		super();
		Name = name;
		Mail_Id = mail_Id;
		PhoneNumber = phoneNumber;
	}

	public EmployeeRegistrationForm() {
		// TODO Auto-generated constructor stub
	}

}