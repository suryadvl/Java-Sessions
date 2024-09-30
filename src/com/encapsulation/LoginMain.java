package com.encapsulation;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage("Surya", "Test");
//		lp.setUserName("Surya");
//		lp.setPassword("1234");
//		System.out.print(lp.getUserName() + lp.getPassword());	
			
		//System.out.println(lp.getUserName() + lp.getPassword());
        lp.doLogin();
        
        System.out.println(lp.getUserName() + lp.getPassword());
        
        lp.setUserName("Priya");
        
        System.out.println(lp.getUserName());
        
	}
	}

