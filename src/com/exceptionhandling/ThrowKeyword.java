package com.exceptionhandling;

public class ThrowKeyword extends Exception{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// own custom exception : used defined exception.
		
		String data = null;
		 if(data == null) {
			 
			 throw new RuntimeException("Custom exception");
		 }

		 System.out.println("Byeee");
	}

}
