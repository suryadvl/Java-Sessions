package com.javasessions;

public class PreConstructorConcep {

	String name;
	int age;
	double Salary;
	char gender;
	boolean isperm;
	
	
	// constructor - name wil be same as class name , 
	// it looks like a function but not a function
	// cant not return anything and no void also there.
	// avoid business logic in constructor. 
	// constructor. is used to initialize the class (instance) variables 
	// constructor can be overloaded.
	// it will  call automatically by default , when we create a object of the class.
	
	 public PreConstructorConcep() {
		 System.out.println("Default constructor");
	 }
	 
	 public PreConstructorConcep(int a) {
		 System.out.println("first params constructor");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreConstructorConcep obj = new PreConstructorConcep(10);
		
		

	}

}
