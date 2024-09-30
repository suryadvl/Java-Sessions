package com.javasessions;

public class FunctionsinJava {
	
	
	// no input no return
	public void test() {
		
		System.out.println("test");
	}
	
	// no input no return. not passign any parameters and not returning anything
	
	public void calc() {
		
		System.out.println("calc");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);

	}
	
	
	// 2 . no input but some return.
	// return type - INteger
	
	  public int getNumber() {
		  
		 System.out.println("Get Number ");
		 int fee = 100;
		 int tax = 20;
		 
		 int totalfee = fee+tax;
		 return totalfee;
		 
		 
	  }
	  
	  
	  public String getTrainerName() {
		  System.out.println("Naveen");
		  return "Naveen";
		  
		  
	  }
	  
	  public boolean isUserActive() {
		  
		System.out.println("checking user status");
		  return true;
	  }
	  
	  
	  // 3. Some input, no return 
	  
	   public void add(int a , int b) {
		   int c = a+b;
		   System.out.println(c);
		   
		   
	   }
	   
	   // 4. some input , return . we can reuse the same method or function just need to pass arguments.
	   
	 public int addition(int a , int b) {
		    
		   System.out.println("Adding 2 integer nuymbers");
		   int c = a+b;
		   
		   return c;
	   }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsinJava obj = new FunctionsinJava();
		
		obj.test();
		obj.calc();
		// System.out.println(obj.getNumber());
		int t = obj.getNumber();
		System.out.println(t-100+30); // we can do some operations after t also , this is advanatge on return
		
		
		String s = obj.getTrainerName();
		System.out.println(s);
		
		
		boolean flag = obj.isUserActive();
		System.out.println(flag);
		if (flag) {
			
			System.out.println("Login to App");
		}
		
		

		obj.add(10, 20);
		
		
		int p = obj.addition(30, 40);
		System.out.println(p);
		
		int p1 = obj.addition(40, 50);
	    System.out.println(p1);
		
		
	}
	
	  

}

// functions 