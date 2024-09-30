package com.javasessions;

public class CallbyRef {
	
	int a;
	String name;
	
	
public void m1(int a) {  // call by value passing arument as value in method.
		
		System.out.println("M1 METHOD CALLED"+a);
		
	}

	
public void m2() {
		
		System.out.println("M2 METHOD CALLED");
		
		
	}

public static void t1(CallbyRef obj) { // calling the obj reference in  static method to get all features of object.
	
	System.out.println("T1 METHOD CALLED");
	obj.m2();
	 
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyRef obj = new CallbyRef();
		obj.m1(10);
		CallbyRef.t1(obj);
		
		

	}

}
