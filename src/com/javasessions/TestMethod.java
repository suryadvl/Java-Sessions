package com.javasessions;

public class TestMethod {
	
	public void getMail() {
		
		System.out.println("getMail method");
	}
	
	
	public static void sendMail() {
		
		System.out.println("sendMail method");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendMail();
		TestMethod obj = new TestMethod();
		
         obj.getMail();
         
         
	}

}
