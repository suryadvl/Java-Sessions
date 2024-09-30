package com.interfacepractice;

public class Student implements PhysicsDept,MathsDept{

	@Override
	public void physicsBooks() {
		
		System.out.println("Student -physicsBooks");
		
	}

		
	public void physicsStudents() {
		 
		 System.out.println(" Student -physicsStudents");
	 }


	@Override
	public void MathsBooks() {
		System.out.println("Student -MathsBooks");
				
	}	
	
	public void mathsStudents() {

		System.out.println(" Student -mathsStudents");
	}	 

	
	public void studentDetails() {
		
		System.out.println(" Own class Method - studentDetails");
	}

	@Override
	public void officeSection() {
		System.out.println("officeSection");
	}
	
}
