package com.javasessions;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55
		
		
		for(int i = 0;i<=5;i++) {
			
			for(int j =0;j<=5;j++) {
				
				System.out.print( i+""+j + " ");
			}
			
			System.out.println();
		}

	}

}
