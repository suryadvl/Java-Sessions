package com.interfacepractice;

public interface PhysicsDept extends College {
	
	 int fees = 100;
	
	//Abstract Method
	
	 public void physicsBooks();
	 
	// Abstract Method with Body  - After JDK 1.8
	 
	 public static void physicsLibrary() {
		 
	  System.out.println("PhysicsDept -physicsLibrary ");	 
	  
	 }
	 
	 // Non Static Methods with body
	 // after jdk 1.8 and we can override this method by keeping public .
	 
	 default void physicsStudents() {
		 
		 System.out.println(" PhysicsDept -physicsStudents");
	 }
	 
	 
	  	 

}
