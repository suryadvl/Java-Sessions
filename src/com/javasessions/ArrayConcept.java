package com.javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array : Similar type of data in  collection
		// two types of arrays - static (fixed) and dynamic (size not fixed)
	   int i[] = new int[4];
	    i[0]=10;
	    i[1]=20;
	    i[2]=30;
	    i[3]=40;
	    
	    System.out.println("Array :"+ i[3]);
	    
	    int len = i.length;
	    System.out.println(+ len);
	    System.out.println("LI " +0);
	    System.out.println("Hi " +(len-1));
	    
	    for(int k=0;k<i.length;k++) {
	    	System.out.println(i[k]);
	    }
		// without any loops want to print i[]
	    
	    System.out.println(Arrays.toString(i));

	}

}
