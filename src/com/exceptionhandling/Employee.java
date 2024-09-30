package com.exceptionhandling;

public class Employee {

	String name;

	public static void main(String[] args) {

		System.out.println("A is printing");

		try {

			Employee e = new Employee();
			e = null;
			e.name = "surya";
			System.out.println("NUll Pointer " + e);

			int i = 9 / 0;
			System.out.println("Hello");

		}

		// it will throw a exception when we give individual down and exception giving
		// up.

//		  catch(Exception e) {
//			  
//			  e.printStackTrace();
//			  
//		  }
		catch (ArithmeticException ae) {
			ae.printStackTrace();

			System.out.println("Arthimetic exception");
		}

		catch (NullPointerException npe) {
			npe.printStackTrace();

			System.out.println("Null pointer exception");
		}

		System.out.println("Bye...");
	}

}
