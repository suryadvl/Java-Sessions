package com.interfacepractice;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
	    s.physicsStudents();
	    s.physicsBooks();
        PhysicsDept.physicsLibrary();
        System.out.println(PhysicsDept.fees);
	    
        System.out.println("--------------------");
        
        s.MathsBooks();
        s.mathsStudents();
        MathsDept.mathsLibrary();
        System.out.println(MathsDept.fees);
        
        
        System.out.println("--------------------");
        PhysicsDept ph = new Student();
             ph.physicsBooks();
             ph.physicsStudents();
             
             
             System.out.println("--------------------");
             
             s.studentDetails();
             
             System.out.println("--------------------");
             
             s.officeSection();
             
		
	}

}
