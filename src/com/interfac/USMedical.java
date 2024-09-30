package com.interfac;

public interface USMedical extends WHO {
	
	// only method declaration , no method descritption.
	// only method prototypoe can give for interface
	// method without body is called Abstract methods (only fo non static method)
	// interfaces - static method can have body 
	// can i have a method with the body : YES . After JDK 1.8 , we can have method with body but static method only
	
	
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();
	
	// can i have a method with the body : YES . After JDK 1.8 , we can have method with body but static method only
	public static void billing() {
		
		System.out.println("US - Billing");
	}

	// second change after jdk 1.8 -
	// can have a non static method with method body , but it should written with default keyword.
	
	
	 default void medicalTest() {
		 
		 System.out.println("After jdk 1.8, default keyword can be used to method body for non static methods");
		 
	 }
		 
	 
	 

}
