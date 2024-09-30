package com.abstraction;

public class TestPage {

	public static void main(String[] args) {
		
	//	LoginPage lp = new LoginPage();  // Grand parent default const -> first parent class default constructor ->child class default const.
		LoginPage lp1 = new LoginPage(10); // Grand parent default const -> first parent class default constructor and child class parameter const.
		
		lp1.title();
		lp1.url();
	    lp1.loading();
	    lp1.doLogin();
	    
	   // lp.logo();	// final cant be override from parent class
	     
	
		// cant create abstract class object 
	      
	      
	    // Type casting - we can override and inherited methods not individual methods  
	      
//	    Page pg = new LoginPage();
//	     
//		pg.title();
//		pg.url();
//		pg.loading();
//	    

	}

}
