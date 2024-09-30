package com.inheritance;

public class BMW extends Car {

	@Override
	public void start() {

		System.out.println("BMW Car ---Start");
	}

	public void autoParking() {

		System.out.println("autoParking ---Start");
	}

	//Method Hiding
	public static void billing() {

		System.out.println("BWM ---billing");
	}

	// individual  BMW class methods 
	private void getCarInfo() {

		System.out.println("Car ---info");
	}

	// final method cant overriden
	// public final void reFuel() {
	//		
	//		System.out.println("Car ---reFuel");
	//	}

}
