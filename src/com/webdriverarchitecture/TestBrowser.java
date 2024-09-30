package com.webdriverarchitecture;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		// SafariDriver driver = new SafariDriver();
		
		// Top Casting - Cross Browser logic
		
		 WebDriver driver = null;
		 
		 String browserName = "Safari";
		 
		  switch(browserName.trim().toLowerCase()) {
		  
		  case  "chrome" :
			  driver = new ChromeDriver();
			break;
			
		  case "firefox" :
			  driver = new FireFoxDriver();
			 break;
			 
		  case "safari" :
			  driver = new SafariDriver();
		     break;
		     
		  default  :
			  System.out.println("Please enter valid browser  "  +browserName);
		      break;
		  }
		  
		
	    driver.get("www.google.com");
	    String s = driver.getTitle();
		System.out.println("Title is :" +s);
		
		driver.sendKeys("Surya", "Test1234");
		driver.click("Search Icon");
		driver.close();
		
		
		
		
	}

}
