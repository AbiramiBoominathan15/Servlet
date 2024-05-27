package com.model;

public class UserLogin {
	String UserName;
	String UserPassword;

	public UserLogin(String userName, String userPassword) {
		super();
		UserName = userName;
		UserPassword = userPassword;
	}
	public UserLogin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLogin [UserName=" + UserName + ", UserPassword=" + UserPassword + ", getUserName()=" + getUserName()
				+ ", getUserPassword()=" + getUserPassword() + "]";
	}

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

}
