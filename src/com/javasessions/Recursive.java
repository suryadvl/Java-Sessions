package com.javasessions;

public class Recursive {
	
	public void getNUM() {
		
		System.out.println("recursive");
		getNUM();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive obj = new Recursive();
		
		obj.getNUM();

	}

}
