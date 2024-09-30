package com.arraylist;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();  // vc - 10 , pc - 10
		
		System.out.println(al.size());
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		System.out.println(al.size()); // Size is 4
		
		// To remove the values
		
		al.remove(2);
		
		al.remove(0);
		System.out.println(al.size());  // size is 2
		
		
		System.out.println(al.get(1));  // to get the index
		
		// to print all elements in arryalist
		 System.out.println(al);
		
		 //use loop
		 //index loop
		 
		 for (int i=0;i<al.size();i++) {
			 
			 System.out.println(al.get(i)); 
			 			 		 
		 }
		 
		 
		  
		 ArrayList list = new ArrayList(); 
		
		list.add(100);
		list.add(12.33);
		list.add("Test");
		list.add(true);
		list.add('a');
		
		System.out.println(list); // this is raw data type - generics , we can add any type of data.
		
		
		//ArrayList Generics
		
		 ArrayList<Integer> numlist = new ArrayList<Integer>(); 
		
		 numlist.add(100);
	//	 numlist.add("Test"); // we cant add , its integer type
		 
		 System.out.println("------------------");
		 
		 ArrayList<String> browserlist = new ArrayList<String>(); 
		  	
		  browserlist.add("Chrome");
		  browserlist.add("Firefox");
		  browserlist.add("edge");
		  browserlist.add("Safari");
		  
		  for(String e : browserlist) {
			  System.out.println(e);
			  if(e.equals("Chrome")) {
				  System.out.println("Enter URL ");
				  break;
			  }
			  
			  			  
		  }
		  
		  		  
		  System.out.println("------------------");
		
		// Object generic for all data types to support.
		  
		  ArrayList<Object> empDataList = new ArrayList<Object>(); 

		  empDataList.add("Tom");
		  empDataList.add(10.22);
		  empDataList.add('A');
		  empDataList.add(123);
		  empDataList.add(true);
		  
		  System.out.println(empDataList);
		  
		  for(Object emp :empDataList ) {
			  System.out.println(emp);
			  
		  }
		  
		  
		  // duplicates are allowed
		  ArrayList<String> studentList = new ArrayList<String>();  
		  
		  studentList.add("Surya");
		  studentList.add("Surya");
		  studentList.add("Surya");
		  studentList.add("Surya");
		  studentList.add("Surya");
		  studentList.add(null);
		  
		  System.out.println(studentList);
		  
		  
		  ArrayList<String> footerList = new ArrayList<String>();  
		  
		  footerList.add("contact us");
		  footerList.add("About us");
		  footerList.add("help");
		  footerList.add("delievry info");
		  footerList.add("cart");
		  footerList.add("Returns");
		  
		  for(String e : footerList) {
			  
			  System.out.println(e);
			  if(e.equals("delievry info")) {
				  
				  System.out.println("Click on it");
				  break;
				  
			  }
			  
		  }
		  
		  
	}
	
	

}
