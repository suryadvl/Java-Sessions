package com.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
	
	
	// List (I)----> ArrayList (C)
	// AL: it maintains the order/index
	

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		System.out.println(al.size());  // current size is 0  . VC is 10 (default - 10)
		
		al.add(100);
		al.add(200);
		
		System.out.println(al.size());// current size is 2 and VC is 8 
		
		al.add(300);
		al.add(400);
		
		System.out.println(al.size());// current size is 4 and VC is 6
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);
		al.add(1000);
		System.out.println(al.size());  // currenct size is 10 and vc is 0
		
		// after completion of Size , LoadFactor - (PC/2)-10/2 is created = 5 VC and same we can add.
		
		al.add(1100);
		System.out.println(al.size()); 
		
		
		

	}

}
