package com.webdriverarchitecture;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		
		System.out.println("Chrome Browser Launching");
	}

	@Override
	public void get(String URL) {
		System.out.println("Entering the URL :" + URL);
		
	}

	@Override
	public String getTitle() {
		
		return "Google";
	}

	@Override
	public void click(String button) {

       System.out.println("Click on the element" + button);
		
	}

	@Override
	public void sendKeys(String Username, String password) {
		// TODO Auto-generated method stub
		
		System.out.println("Entering the Username and pwd" +Username +password);
	}

	@Override
	public void close() {

		System.out.println("Close the browser");
	}

	
	

}
