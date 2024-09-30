package com.stringmanipulations;

public class StringReverse {
	
	
	 public static String stringRev(String st) {
		 
		String rev = "" ;
		int len =  st.length();
		for(int i = len-1; i>=0;i--) {
			
			rev = rev+st.charAt(i);
			
			}
		
		 return rev;
		 
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "selenium";
		String st1 = stringRev(st);
		
		System.out.println(st1);
		
		System.out.println();

	}

}
