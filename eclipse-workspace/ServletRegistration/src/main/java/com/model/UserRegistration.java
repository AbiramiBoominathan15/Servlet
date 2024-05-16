package com.model;

public class UserRegistration {
	public String userName;
	public String password;
	public String confirmPassword;
	public String email;
//	public String gender;
	public String dateOfBirth;
	public String age;
	public String phonenumber;

	public UserRegistration(String userName, String password, String confirmPassword, String email,
			String dateOfBirth, String age, String phonenumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "UserRegistration [userName=" + userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", email=" + email + ",  dateOfBirth=" + dateOfBirth
				+ ", age=" + age + ", phonenumber=" + phonenumber + ", getUserName()=" + getUserName()
				+ ", getPassword()=" + getPassword() + ", getConfirmPassword()=" + getConfirmPassword()
				+ ", getEmail()=" + getEmail() + ",  getDateOfBirth()="
				+ getDateOfBirth() + ", getAge()=" + getAge() + ", getPhonenumber()=" + getPhonenumber() + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}