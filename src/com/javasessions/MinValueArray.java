package com.javasessions;

public class MinValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,4,7,3,2};
		
		int Min = a[0];
		 
		for(int i = 1;i<a.length;i++) {
			
			if(a[i]<Min) {
				
				Min = a[i];
				
			}
			
		}
		
		System.out.println(+Min);


	}

}
