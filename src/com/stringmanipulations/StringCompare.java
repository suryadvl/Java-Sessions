package com.stringmanipulations;

public class StringCompare {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Selenium";
		
		String s2 = new String("Selenium");
		
		System.out.println(s1==s2); // false
		
		System.out.println(s1.equals(s2)); 
		
		
		String s3 = "Selenium";
		
		System.out.println(s1==s3); // this wil give true , bcoz of string constanct pool dont share dupplicate , its already hvg s2
		
		
		 
		String str = new String ("testing"); // 2 values w2il be created , 1 is in scp and 1 is heap 
		
		String st = "testing"; // 0 , this is string literls and hvg alresdy testing , so no duplicate.
		
		
		String t1 = "Hello";
		System.out.println(t1.concat("automation"));
		System.out.println(t1);
		
		String t2 = "Helloautomation";
		
		
		

	}

}
