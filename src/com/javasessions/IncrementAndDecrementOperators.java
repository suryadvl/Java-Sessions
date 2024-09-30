package com.javasessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		// Post increment
		int a = 1;
		int b = a++;
		
		System.out.println(a);// 2
		System.out.println(b); // 1 first a value assing to b then a increments and bocomes 2
		
		
		int c = 1;
		int d = ++c;
		
		System.out.println(c); // 2
		System.out.println(d); // 2
		
		
		// PreIncrement
		
		int x = -55;
		int  y = ++x;
		System.out.println(x);//-54 
		System.out.println(y);//-54
		
		//Post decrement
		
		int m = 10;
		int n = m--;
		System.out.println(m);//9
		System.out.println(n);//10
		
		int total = 10;
		System.out.println(total--); // 10
		System.out.println(total); // 9 after 10 decremtn and shows 1
		
		
		// Pre decrement
		
		int v = 5;
		System.out.println(--v); // 4
		 
		int num = 10;
		System.out.println(--num); //9
		
		
		int k = 11;
		int l = k++ + ++k;
		System.out.println(l); // 11 + 13 = 24
		
		
		int ch = 'A';
		
		System.out.println(ch++); // 65
		
		System.out.println(ch); // 66
		
		
          char ch1 = 'A';
		
		System.out.println(ch1++); // A
		
		System.out.println(ch1); // B
		
		
		//assignment 
		
		

	}

}
