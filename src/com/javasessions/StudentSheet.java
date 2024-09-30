package com.javasessions;

public class StudentSheet {

	
	// WAF : getStundetMarks(String Name)
	//return marks : int
	//0 to 100
	
	public int getStundentmarks(String name) {
		System.out.println("Student Name : "+ name);
		switch (name.toLowerCase().trim()) {
		case "Priya":
			return 90;
			
		case "Surya":
			return 100;
		
		case "Rambai":
		return 50;
		
		default :
			System.out.println("plz pass valid stundet name" + name);
			return -1;
		
				}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentSheet ss = new StudentSheet();
		int m = ss.getStundentmarks("Surya");
		if(m>90) {
					
        System.out.println("Marks" + m);
		}
        
	}

}
