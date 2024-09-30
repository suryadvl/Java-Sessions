package com.javasessions;

public class SwitchCondition {

	public static void main(String[] args) {
		
		String browser = "Safari ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome");
			break;
		case "Firefox":
			System.out.println("Firefox");
			break;
		case "IE":
			System.out.println("IE");
			break;
		case "safari":
			System.out.println("safari");
			break;
			

		default:
			
				System.out.println("Plz pass right browser" + browser);
				break;
			
		}

	}

}
