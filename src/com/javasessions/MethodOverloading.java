package com.javasessions;

public class MethodOverloading {

	// polymorphism (ploy - names , morphism -diff types) or overloading
	// within the same class , if we have multiple methods: 
	//1. method name should be same
	//2. diff no. of paramters
	//3 diff sequences of parameters for same method
	// return type doesnt matter
	// compile time poly morphishm 
	// static poly morphism
	// will be used for same functionality - like login .
	
	
	
	 public int test() {
		 return 100;
	 }
	 
	 
	 public double test(int a) {
		 return 12.3;
	 }
	 
	 public void test(int a,String x) {
		 System.out.println("test method");
		 
		
	 }
	 
	 public void test(String x,String y) {
			
	 }
	 public void test(String x,int a) {
			
		 
	 }
	 
	 // use case of overlaoding
	 public void login() {
		 
	 }
     public void login(String name , String pwd) {
		 
	 }

     public void login(String name , String pwd, int otp) {
		 
	 }
	 
     // use case search
     
     public void search() {
    	    	 
     }
     
     public void search(String name,String Color) {
    	 
    	 System.out.println("Search with" + ""+ Color);
    	     	 
     }
 
     // Payment : use case for overlaoding
   
      public void doPay() {};
      public void dopay(String cc , int pin) {};
      
      // uber: 
      
      public void carBookind(String CarType ,String spoint, String dpoint) {};
      
      
	      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		 mo.test(1,"test");
		 mo.search("Surya", "blue");
		

	}

}
