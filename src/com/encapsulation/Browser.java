package com.encapsulation;

public class Browser {
	
	// public method
	
	public void launchBrowser() {
		
		System.out.println("Browser is launching");
		checkRamSize();
		
	}

	
	// private method - encapsulation , we cant see this method when creating the obj.
	
	
	private void checkRamSize() {
		
		System.out.println("checking RamSize");
	}
	
	
	
}
