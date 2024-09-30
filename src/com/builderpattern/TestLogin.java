package com.builderpattern;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new Application();
		
		// builder pattern 
		// work flow scenario
		
		app.login("Surya", "Test1234")
		   .search("Adidas")
		   .addToCart("Adidas")
		   .doPayment("link")
		   .doPayment("1234", 123)
		   .generateOrderId()
		   .logout();
		   
		
		// 2. work flow 
		
		app.login("Surya", "Test1234")
		   .search("Adidas")
		   .logout();
		
		
		// in this case , no need of creating object again and using the existing object for method chain.
		// calling the methos 1 by 1 based on our scenarios
		
		

	}

}
