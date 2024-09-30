package com.javasessions;

public class Browser {
	
	public void click(String element) {
		
		System.out.println("Element" + element);
	}
	
	public void sendKeys(String element , String value) {
		System.out.println("Entering values :" + element);
		
	}
	
	public String getTitle() {
		
		return "google";
	}
	
	
	public boolean launchBrowsewr(String browserName) {
		
				
		System.out.println(browserName);
		boolean flag = true;
		
		switch (browserName.toLowerCase().trim()){
		
		case "Chrome":
			System.out.println("Chrome Browser is laucnhed " + browserName);
			break;
		case "Safari":
			System.out.println("Safari Browser is laucnhed " + browserName);
			break;
			
		case "Edge":
			System.out.println("Edge Browser is laucnhed " + browserName);
			break;
			
	    default:
	    	System.out.println("Plz pass valid Browser" + browserName);
	    	 flag = false;
			break;
				
		 
		}
		
		 return flag;
		
	}
	

	public static void main(String[] args) {
		Browser obj = new Browser();
		
		boolean exec = obj.launchBrowsewr("Chrome");
		System.out.println(exec);

		if(exec) {
			
			System.out.println("Enter the URl");
		}
	}

}
