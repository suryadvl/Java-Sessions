package com.accessmodifier1;

public class Car {
	
	String name;  // default 
	public int price;
	protected String color;
	private String chasisNum;
	
	
	public Car(int pub) {
		
		System.out.println("Public constructor");
	}
	
	Car(){
		
		System.out.println("Default constructor");
		
		
	}
	
	protected Car(String Pro) {
		System.out.println("Protected constructor");
		
	}
	
	private Car(String p ,int b) {
		System.out.println("Protected constructor");
		
	}
	
	
	
	
	void defMethod() {
		
		System.out.println("Default method");
	}
	
	public void pubMethod() {
		System.out.println("Public method");
		
	}
	
	protected void proMethod() {
		System.out.println("protected method");
		
	}
	
	private void priMethod() {
		System.out.println("private method");
		
	}
	
	
	
	public static void main(String[] args)
	{
		Car c = new Car();
		
		 
		
	}
	

}
