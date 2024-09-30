package com.javasessions;

public class MaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// searching max number
		
		int[]a = {4,3,5,2,1,6};
		 int Max = a[0];
		 for(int i = 1;i<a.length;i++) {
			 
			   if(a[i]>Max) {
				   
				   Max = a[i];
			   }
		 }
		 
		  System.out.println(+Max);

	}

}
