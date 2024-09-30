package com.stringmanipulations;

public class StringRevPractice {
	
	
	public static String revString(String st) {
		
		if(st==null) {
			
			throw new RuntimeException("Value can not be null");
			
		}
		
		if(st.length()==1 || st.length()==0) {
			
			return st;
			
			
		}
		
		
	  int len= st.length();
	  
	   String rev = "";
		
	  for(int i=len-1;i>=0;i--) {
		  
		  rev = rev+st.charAt(i);
		  
	  }
	  
	  return rev;
	   
		
	}

	public static void main(String[] args) {
		
   //    String str= null;
       
    //  System.out.println(revString(str));
      
       System.out.println(revString("Testing"));
       
       System.out.println(revString("T"));
       
       System.out.println(revString(" test"));
   
       System.out.println(revString(""));
       
       
	}

}
