package com.superkeyword;

public class BMW extends Car{
	
	
	public BMW() {
		
		super();
		System.out.println("Child default const.");
		
	}
	
	
public BMW(int a) {
		super(10);
		System.out.println("Child default para const.");
	}

public BMW(int a,int b) {
	super(10,20);
	System.out.println("Child default para const." +(a+b));
}
	


	int speed = 300;

	@Override
     public void start() {
		
		System.out.println("BMW Car ----start");
		
		// if i want to call parent call start method , use super keyword
		
		super.start();
	}
	
	public void autoParking() {
		
		System.out.println("BMW Auto parking");
	}
	
	public void speedDisplay() {
		
		System.out.println("BMW car Speed : " + speed);
		
		System.out.println(" car Speed : " + super.speed);
		
	}
	
	
}
