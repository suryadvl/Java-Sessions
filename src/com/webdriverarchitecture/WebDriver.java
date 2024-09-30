package com.webdriverarchitecture;

public interface WebDriver {
	
	public void get(String URL);
	public String getTitle();
	public void click (String element);
	public void sendKeys (String element ,String key);
	public void close();
	
	

}
