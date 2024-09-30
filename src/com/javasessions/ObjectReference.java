package com.javasessions;

public class ObjectReference {

	
	String Name ;
	 int Age;
	 String City;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectReference or = new ObjectReference();
		ObjectReference or1 = new ObjectReference();
		ObjectReference or2 = new ObjectReference();
		ObjectReference or3 = new ObjectReference();
		
		or.Name= "S1";
		or.Age=36;
		or.City="HYD";
		
		or1.Name= "S2";
		or1.Age=37;
		or1.City="Bangalore";
		
		or2.Name= "S3";
		or2.Age=38;
		or2.City="Vizag";
		
		or3.Name= "S4";
		or3.Age=39;
		or3.City="Chennai";
		
		System.out.println(  or.Name + " "  +  or.Age + " " +  or.City);
		System.out.println( or1.Name + " "  + or1.Age + " " +  or1.City);
		System.out.println( or2.Name + " "  + or2.Age + " " +  or2.City);
		System.out.println( or3.Name + " "  + or3.Age + " " +  or3.City);
		System.out.println("********");
		
		or.Name = or1.Name; 
					
		System.out.println(  or.Name + " "  +  or.Age + " " +  or.City);
		System.out.println( or1.Name + " "  + or1.Age + " " +  or1.City);
		System.out.println( or2.Name + " "  + or2.Age + " " +  or2.City);
		System.out.println( or3.Name + " "  + or3.Age + " " +  or3.City);

		System.out.println("********");
		
		or1.Name = or2.Name;
					
				
		System.out.println(  or.Name + " "  +  or.Age + " " +  or.City);
		System.out.println( or1.Name + " "  + or1.Age + " " +  or1.City);
		System.out.println( or2.Name + " "  + or2.Age + " " +  or2.City);
		System.out.println( or3.Name + " "  + or3.Age + " " +  or3.City);
		
		System.out.println("********");
		
		or2.Name = or3.Name;
		
		System.out.println(  or.Name + " "  +  or.Age + " " +  or.City);
		System.out.println( or1.Name + " "  + or1.Age + " " +  or1.City);
		System.out.println( or2.Name + " "  + or2.Age + " " +  or2.City);
		System.out.println( or3.Name + " "  + or3.Age + " " +  or3.City);
		
		System.out.println("********");
		
		or3.Name = or.Name;
		
		System.out.println(  or.Name + " "  +  or.Age + " " +  or.City);
		System.out.println( or1.Name + " "  + or1.Age + " " +  or1.City);
		System.out.println( or2.Name + " "  + or2.Age + " " +  or2.City);
		System.out.println( or3.Name + " "  + or3.Age + " " +  or3.City);
		
		
		
	}

}
