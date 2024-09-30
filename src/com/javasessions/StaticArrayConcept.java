package com.javasessions;

import java.util.Arrays;

public class StaticArrayConcept {
	
	
		// static arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i[] = new int[3];
		i[0] =10;
		i[1] =20;
		i[2] =30;
		
		System.out.println(Arrays.toString(i));

	
	  // for each concept 
	
	  for( int e : i) {
		  System.out.println(e);
		  
	  }
	  
	   double d[] = new double[3];
	   d[0] = 10.12;
	   d[1]=123.12;
	   d[2]=12.33;
	   
	   for(double e : d) {
		   System.out.println(e);
	   }
	   
	   // char 
	   
	   char ch[] = new char[3];
	    ch[0]='A';
	    ch[1]='B';
	    ch[2]='C';
	    
	    for(char w : ch) {
	    	System.out.println((byte)w);
	    	
	    }
	    
	    System.out.println(Arrays.toString(ch));	 
	    
	    
	    // String Array
	    
	    String emp[] = new String[3];
	    emp[0] = "Surya";
	    emp[1] = "Priya";
	    emp[2] = "Amma";
	    
	    for(String s : emp) {
	    	System.out.println(s);
	    	if(s.equals("Surya")) {
	    		
	    		System.out.println("emp is admin");
	    		break;
	    		
	    	}
	    }
	    
	    
	    // empdata = name(String) , Age(int), gender (char), Salary(double),isperm(boolean)
	    
	    // object is super class of all class types.
	     Object data[] = new Object[5];
	     
	     data[0]="Surya";
	     data[1]=36;
	     data[2]="M";
	     data[3]=33.35;
	     data[4]=true;
	     
	      System.out.println(Arrays.toString(data));
	    
	      for(Object e:data) {
	    	  System.out.println(e);
	      }
	      
	      int k;
	      for(k=0;k<=data.length-1;k++) {
	    	  System.out.println(data[k]);
	    	  
	      }
	      	      
	      System.out.println("------------------------");
	      
	      int p[]=new int[4];
	      p[0]=10;
	      p[1]=20;
	      p[2]=30;
	      p[3]=40;
	      
	  	      for(int k1=p.length-1;k1>=0;k1--) {
	    	  System.out.println(p[k1]);
	    	  
	    	  	      }
	  	    System.out.println("------------------------");   
			  // using for each also printing the numbers in reverse order
	  	      
	  	      int count = p.length-1;
	  	      for(int e: p) {
	  	    	  System.out.println(p[count]);
	  	    	  count--;
	  	      }
	  	      
	  	      // Array Literals 
	  	      
	  	      int num[] = {10,20,30,40,50};
	  	      
	  	      System.out.println(Arrays.toString(num));
	  	      
	  	      
	  	      
	  	      
}}

