package com.exceptionhandling;

public class Browser {
	
	
	// Amazon app
	public void search() {
		
		System.out.println("Search the Prod");
		cart();
	}
	
	// Amazon app
	public void cart() {
		
		System.out.println("Add to cart");
		try {
		doPayment();
	}
		catch(ArithmeticException ae) {
			
		ae.printStackTrace();
		
		 System.out.println("some thing is getting AE");
			}
		}
	
	
	// Bank App 
	public void doPayment() throws ArithmeticException  {
		
		System.out.println("payment link");
		int i = 9/0;
		System.out.println(+i);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br = new Browser();
		br.search();
		System.out.println("Byeeee");
		

	}

}
