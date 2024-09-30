package com.abstraction;

public class LoginPage extends Page{
	
	public LoginPage() {
		
		System.out.println("Login Page const");
	}
	
	public LoginPage(int a) {
		
		System.out.println("Login Page const" +a);
	}
	
	
	// Abstract Methods

	@Override
	public void title() {
		System.out.println("title");
		
	}

	@Override
	public void url() {
		System.out.println("url");
		
	}
	
	@Override
	public void loading() {
		System.out.println("Page is loading in 5 sec");
	}
	
	public void doLogin() {
		
		System.out.println("login to App");
	}
}
