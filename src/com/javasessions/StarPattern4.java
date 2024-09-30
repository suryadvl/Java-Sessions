package com.javasessions;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * for(int i = 1;i<=5;i++) {
		 * 
		 * for(int j = i;j<=4;j++) {
		 * 
		 * System.out.print(" "); }
		 * 
		 * for(int k = 1;k<=i;k++) {
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */
		
		// Any for loop is working.
	
	 for(int i = 1;i<=4;i++) {
		 
		 for(int j = 3;j>=i;j--) {
			 
			 System.out.print(" ");
		 }
		 for(int k = 1;k<=i;k++) {
			 
			 System.out.print("*");
		 }
		 
		 System.out.println();
	 }
	}
}
