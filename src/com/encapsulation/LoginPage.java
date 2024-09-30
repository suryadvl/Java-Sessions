package com.encapsulation;

public class LoginPage {

	private String UserName;
	private String Password;
	
	
	// constructor through setting the values
	
	public LoginPage(String userName, String password) {
	
		UserName = userName;
		Password = password;
	}
	
	// generated setter/getters
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	public void doLogin() {
		
		System.out.println(" Login detials :" + " " + getUserName()+ getPassword());
	}
	
	
}
