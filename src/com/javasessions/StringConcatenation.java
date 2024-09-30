package com.javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		String name = "Surya";
		String num = "0001";
		
		String x = "Hello";
		String y = "Selenium";
		
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.print(name+num);
		
		System.out.println(a+b+num);
		System.out.print(x+y+name+num);
		
		System.out.println("The Value of a" +a);
		System.out.println("The Value of b" +b);
		System.out.println("The Value of a+b" +(a+b));
		
		
		char ch = 'a';
		char ch1 = 'b';
		System.out.println(ch+ch1);
		//range of Ascii values a to z = 97 to 122
		  //      A to Z = 65 to 90
		    //    0-9 = 48 to 57 
		
		//how to find ascII value of a 
		  System.out.println((byte)ch);
		  System.out.println(ch+0);
		  
		  boolean flag = true;
		  String u = "Yes";
		  System.out.println(flag+u);
		  System.out.println(flag+ ""+ ch);
		  
		  
		  
		        

	}

}
