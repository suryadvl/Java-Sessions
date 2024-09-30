package com.inheritance;

// if class is final , then cant be parent and prevention of Inheritance

public class Car extends Vehicle{

	int Speed = 100;

	public void start() {

		System.out.println("Car ---Start");
	}

	public void Stop() {

		System.out.println("Car ---Stop");
	}

	public final void reFuel() {

		System.out.println("Car ---reFuel");
	}

	public static void billing() {

		System.out.println("Car ---billing");
	}

	private void getCarInfo() {

		System.out.println("Car ---info");
	}
}
