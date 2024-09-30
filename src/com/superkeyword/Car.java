package com.superkeyword;

public class Car {
	
	int speed = 100;
	
	public Car() {
		
		System.out.println(" parent Default const.");
	}

public Car(int a) {
		
		System.out.println(" parent Default para const.");
	}

public Car(int c,int d) {
	
	System.out.println(" parent Default para const." +(c+d));
}


	
	public void start() {
		
		System.out.println("Car ----start");
	}
	
	
public void refill() {
		
		System.out.println("Car ----refill");
	}
}
