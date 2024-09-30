package com.inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Vehicle v = new Vehicle();
        v.engine();
		
		BMW b = new BMW();
		b.reFuel(); // inherited 
		b.start(); //Overriden 
		b.Stop(); // inherited
		b.autoParking(); // Individual bmw class.
		b.billing();
	    b.engine();
		System.out.println(b.Speed);
	
		
		
		System.out.println("-------------");
		
		Car c = new Car();
		c.start();
		c.Stop();
		c.reFuel();
		c.billing();
		c.engine();
		System.out.println(c.Speed); // this is  not variable overriding.
		System.out.println("-------------");
	
	  Audi a = new Audi();
	  a.start();
	  a.theftSafety();
	  a.Stop();	  
	  a.engine();
	
	   // composition 
	   // it is similar to selenium  concept- WebDriver driver = new ChromeDriver();
	    
	      
	  
	   Car c1 = new BMW();
	   c1.billing();
	   c1.start();
	  
	  
	 

}}
