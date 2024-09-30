package com.javasessions;

public class MethodChaining1 {
	
	public void m1() {
		
		System.out.println("M1 METHOD CALLED");
		m2();
	}

	
public void m2() {
		
		System.out.println("M2 METHOD CALLED");
		m3();
		
	}


public void m3() {
	
	System.out.println("M3 METHOD CALLED");
	
	
}


public void m4() {
	
	System.out.println("M4 METHOD CALLED");
	
	
}

public static void t1() {
	
	System.out.println("T1 METHOD CALLED");
	t2();
	
	
}

public static void t2() {
	
	System.out.println("T2 METHOD CALLED");
	t3();
	
}

public static void t3() {
	
	System.out.println("T3 METHOD CALLED");
	t4();
	
}
public static void t4() {
	
	System.out.println("T4 METHOD CALLED");
	MethodChaining1 obj2 = new MethodChaining1();
	obj2.m4();
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining1 obj = new MethodChaining1();
		obj.m1();
		MethodChaining1.t1();
		
	}

}
