package com.stringmanipulations;

import java.util.Arrays;

public class StringManipulations {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hi this is my java code and i am so happy";
		System.out.println(str.length()); 
		
		System.out.println("Lowest index" +0);
		System.out.println("Highest index" +(str.length()-1));
		
		// to give the character from strings - use charAt
		
		System.out.println(str.charAt(3));
		//System.out.println(str.charAt(41)); // string index out of bound exception , bocz of out of range.
		
		// System.out.println(str.charAt(-1));// string index out of bound exception , bocz of out of range.
		
		// to get the index of the 
		
		System.out.println("index of " + str.indexOf('h')); // o position
		
		System.out.println("index of " + str.indexOf('i'));
		
		// to get the 2 occurance of i in the string
		 
	//	System.out.println(str.indexOf('i', 2));
		
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		// home work on 4th i 
		
		
		String msg = "welcome admin";
		if(msg.indexOf("admin")==8) {
			
			System.out.println("admin is present ---PASS");
		}
		
		else {
			
			System.out.println("admin is not present ---FAIL");
		}
		
		
		// if we cant  to trim between the hello world . need to do
		
		String t1 = "   Hello World  ";
		System.out.println(t1.trim());
		
		
		
		System.out.println(t1.replace(" " , ""));
		
		
		// replace
		
		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		
		// contains 
		
		String test = "I love java coding";
		System.out.println(test.contains("Java"));
		
		if(test.contains("java")) {
			
			System.out.println("PASS");
		}
		else {
			
			System.out.println("FAIL");
		}
		
		// Equals 
		
		String r1 = "Selenium";
		String r2 = "selenium";
		
		System.out.println(r1.equals(r2));
		
		
		//split
		
		String lang = "JAVA_PYTHON_PERL";
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		
		
		// interview question 
		
		String pop = "xXHellowXxXSeleniumxXTestingXxXGoogleX";
		String pp[]= pop.split("xX");
		System.out.println(pp[0]);
		
		System.out.println(pp[1]);
		System.out.println(pp[2]);
		System.out.println(pp[3]);
		System.out.println(pp[4]);
		
		System.out.println(Arrays.toString(pp));
		
		String otp = "your otp numner is 12345";
		
		 String ot[] = otp.split(" ");
		 System.out.println(ot[ot.length-1]);
		 	
		 
		
	}

}
