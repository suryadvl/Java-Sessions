package com.javasessions;

public class IfElseconcept {
	
	// when comparing primitive data types use : ==
	// when comparing non primitive data types use : .equals

	public static void main(String[] args) {
		
		int a =30;
		int b =20;
		
		if(a>b) {
			System.out.println("A is gr then B");
		}
			
			else {
				
				System.out.println("B is gr then A");
				
			}
			
			if(false) {
				
				System.out.println("Dead Code"); // dead code
			}
			
			boolean flag = true;
			if(flag) {
				
				System.out.println("True");
				
				
			}
			
			else {
				
				System.out.println("false");
			}
			
			
			int marks = 100;
			
			if(marks<=100) {
				
				System.out.println("Grade A");
						
			if(marks>=95) {
			 System.out.println("100 % scholorship");	
			}			
			else {
				
				System.out.println("10% tuitipon fee");
			}
			
			if(marks==100) {
				
				System.out.println("Execllant");
			}
			
			
			}
			
			else {
				
				System.out.println("Invalid Marks");
			}
			
			
//			String browser = "chrome"; this is not best praactise , it goes all the if conditions if first is satisgfied also
//			if(browser.equals("chrome")) {
//				System.out.println("chrome is lauched");
//			}
//			
//			if(browser.equals("Edge")) {
//				System.out.println("Edge is lauched");
//			}
//			if(browser.equals("IE")) {
//				System.out.println("IE is lauched");
//			}
//			if(browser.equals("FireFox")) {
//				System.out.println("FireFox is lauched");
//			}
//			
//			else {
//				
//				System.out.println("Plz lauch correct browser" + browser);
//			}
			
			String Browser = "Opera";
			if(Browser.equals("Chrome")) {
				System.out.println("Chrome laucnhes");
							}
			else if(Browser.equals("IE")) {
				System.out.println("IE launches");
			}
			else if(Browser.equals("IE")) {
				System.out.println("IE launches");
			}
			else if(Browser.equals("IE")) {
				System.out.println("IE launches");
			}
			else {
				System.out.println("Plz lauch correct browser" +"  " +  Browser);
			}
			
}}


