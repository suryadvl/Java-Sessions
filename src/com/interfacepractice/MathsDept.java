package com.interfacepractice;

public interface MathsDept {
	
	int fees = 200;
	// Abstract Method

	public void MathsBooks();

	// Abstract Method with Body - After JDK 1.8

	public static void mathsLibrary() {

		System.out.println("MathsDept -mathsLibrary ");

	}

	// Non Static Methods with body or Non Abstract Methods
	// after jdk 1.8 and we can override this method by keeping public .

	default void mathsStudents() {

		System.out.println(" MathsDept -mathsStudents");
	}	 

}
