package com.dataconversion;

public class DataConvert {

	public static void main(String[] args) {

		String x = "100";

		System.out.println(x + 20); // 10020

		int i = Integer.parseInt(x);
		System.out.println(i + 20); // 120

		// string to double

		String s = "100.33";

		System.out.println(s + 20); // 100.3320

		double d = Double.parseDouble(s);
		System.out.println(d + 20); // 120.33

		// int to String

		int t = 100;
		System.out.println(t + 20); // 120

		String e = String.valueOf(t); // imp method
		System.out.println(e + 20); // 10020

		// double to string

		double marks = 200.33;
		String st = String.valueOf(marks);
		System.out.println(st + 20);

		// char to String

		char ch = 'A';
		String c = String.valueOf(ch);
		System.out.println(c + 20); // A20

		// String to boolean - either true or false need to return

		String tr = "true";
		boolean flag = Boolean.parseBoolean(tr);
		if (flag) {

			System.out.println("True");
		} else {

			System.out.println("False");
		}

		// boolean to String

		boolean br = true;

		String str1 = String.valueOf(br);
		System.out.println(str1 + 20);

		// character array to string

		char ch1[] = { 'A', 'B', 'C' };
		String st2 = String.valueOf(ch1);
		System.out.println(st2);

		// Non Primitive to Primitive

		Integer v = 100;
		System.out.println(v + 20);

		// primitive data comparision we use : ==
		// non primitive data comparision we use : .equals

		// espcape character
		String rest = "I Love \"Java\" code";

	}
}
