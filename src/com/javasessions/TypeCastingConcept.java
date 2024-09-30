package com.javasessions;

public class TypeCastingConcept {

	public static void main(String[] args) {

        int i = 200;
        byte b = (byte) i;
        System.out.println(b);  // - 56 bcoz it cant hold bigger value.
        
        // Type casting -> Widening ->smaller store in bigger storage and narrowing.

        
        int j = 10;
        byte b1 =(byte) j;
        System.out.println(b1); // widdening. smaller value storing. byte can hold 128.
        
        
	}

}
