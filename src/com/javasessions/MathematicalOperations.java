package com.javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(1+2);
		System.out.println(1.0+2);
		System.out.println(1+2.0);
		System.out.println(9/2);
		System.out.println(9.0/2);
		System.out.println(9/2.0);
	//	System.out.println(9/0); // Arthimetic exception
		System.out.println(0/9);
		
		System.out.println(0/9.0);
		System.out.println(0.0/0.0); // Nan
		System.out.println(0/0.0); //Nan - Not a number
		
		System.out.println(0.1+0.2); // 0.30000000000000004  its a double
		System.out.println(0.1+0.3);
		System.out.println(0.1f+0.2);
		

	}

}
