package com.stringmanipulations;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Selenium");
		
		// sb = "testing";   not allowed bcoz String Builder is mutable and wont allow literals
		sb.append("Automation");
		
		System.out.println(sb); // mutable
		
		// String Buffer is thread Safe , same object wil be acess by users in sequential 
		
		// String Builder is non thread safe , all users can access the object at a same time.
		
		System.out.println(sb.reverse());
		

	}

}
