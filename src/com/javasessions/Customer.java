package com.javasessions;

public class Customer {
	
	 // write a function 
	 // create a function - this will return the customer marks on the basis of name.
	 // name - getCustomerMarks(String name)
     // return : Marks
	
	
	public int getCustomerMarks(String name) {
		
		System.out.println("Customer name is :" + name);
		
		 if (name.trim().equalsIgnoreCase("Piyush")){
			 return 90;
			 
		 }
		 
		 else if (name.trim().equalsIgnoreCase("Naveen")){
			 
			 return 10;
		 }
			 
		 else if (name.trim().equalsIgnoreCase("Ravi")) {
			 
			 return 20;
		 }
		 else{
			 
			 System.out.println("Please pass valid customer name :");
			 return -1;
			 
		 }
		 }
		
	
	
	
	public static void main(String[] args) {
		
		Customer cust = new Customer();
		
		int marks = cust.getCustomerMarks("pooja");
		System.out.println(marks);
		
		if(marks >=0) {
			
			System.out.println("Print the MarkSheet");
			
			
		}
		

	}

}
