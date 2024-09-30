package com.builderpattern;

public class Application {
	
	public Application login() {
		
		System.out.println("logion to the app");
		return this;
	}
	
	public Application login(String un,String pwd) {
		
		System.out.println("logion to the app" +un +pwd);
		return this;
	}

   public Application search(String ProductName) {
	   System.out.println("Searching the product" +ProductName);
	   return this;
	   
   }

    
   public Application search(String productName , int price) {
	   System.out.println("Searching the product" +productName + price);
	   return this;
   }
   
   public Application addToCart(String ProductName) {
	   System.out.println("Searching the product" +ProductName);
	   return this;
   }
   
   public Application doPayment(String upi) {
	   System.out.println("Searching the product" +upi);
	   return this;
   }
   
   public Application doPayment(String cc , int cvv) {
	   System.out.println("Searching the product" +cc + cvv);
	   return this;
   }
    
   
   public Application generateOrderId() {
	 System.out.println("Order Id" );
	 return this;
   }

   public Application logout() {
		 System.out.println("Logout" );
		 return this;
	   }
   
}
