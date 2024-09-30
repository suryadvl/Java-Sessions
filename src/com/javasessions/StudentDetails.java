package com.javasessions;

public class StudentDetails {
	
	int rollnum;
	String Name;
	int Marks;
	
	
	public void getStundentDetails(int a,String b,int c) {
		
		System.out.println("Student details" +a+b+c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails obj = new StudentDetails();
		obj.getStundentDetails(101, "Surya", 100);

	}

}
