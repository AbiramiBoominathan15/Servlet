package com.model;

public class EmployeeRegistrationForm {
	String Name;
	String Password;
	String Mail_Id;
	String PhoneNumber;

	public EmployeeRegistrationForm(String name, String password, String mail_Id, String phoneNumber) {
		super();
		Name = name;
		Password = password;
		Mail_Id = mail_Id;
		PhoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "EmployeeRegistrationForm [Name=" + Name + ", Password=" + Password + ", Mail_Id=" + Mail_Id
				+ ", PhoneNumber=" + PhoneNumber + ", getPassword()=" + getPassword() + ", getName()=" + getName()
				+ ", getMail_Id()=" + getMail_Id() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}

	
	
	
	
	
	
	
	

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}


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



	public EmployeeRegistrationForm() {
		// TODO Auto-generated constructor stub
	}

}