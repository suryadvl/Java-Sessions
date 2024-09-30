package com.abstraction;

public abstract class Page extends MainPage {
	
	public Page() {
		
		System.out.println("page const ---default ");
		
	}

	
	
	public Page(int b) {
		
		System.out.println("page const ---default " +b);
		
	}
	
	
	
	// Abstract Methods
	public abstract void title();
	public abstract void url();
    
	
	// Non Abstract Methods
	
	public void loading() {
		
		System.out.println("Page is loading in 20 Sec");
	}
	
	public final void logo(){
		System.out.println("Company Logo");
		
	}

	
}
