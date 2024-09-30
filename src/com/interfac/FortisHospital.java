package com.interfac;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndiaMedical {

	// US Medical methods
	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHospital -physioServices");
		
	}
	

	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");

	}

	@Override
	public void dentalServices() {

		System.out.println("dentalServices");

	}

	// UK Medical methods

	@Override
	public void ENTServices() {
		System.out.println("ENTServices");

	}

	@Override
	public void pediaServices() {

		System.out.println("pediaServices");

	}

	@Override
	public void DermaServices() {

		System.out.println("DermaServices");
	}

	// India Medical methods
	@Override
	public void cardioServices() {

		System.out.println("cardioServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("orthoServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("neuroServices");

	}

	// Own Individual methods

	public void medicalTraining() {

		System.out.println("medicalTraining");

	}

	public void pathologyServices() {

		System.out.println("pathologyServices");

	}

	// common method
	@Override
	public void emergencyServices() {

	}

	// method hiding

	public static void billing() {

		System.out.println("Fortis - Billing");
	}

// trying to override default method of interface
	@Override
	public void medicalTest() {

		System.out.println("After jdk 1.8, default keyword can be used to method body for non static methods");

	}

	
	public void covidVaccination() {
		// TODO Auto-generated method stub
		
	}

	
	
//	// WHO 
//  @Override
//	public void covidVaccination() {
//		// TODO Auto-generated method stub
//		System.out.println("Fortis Hospital vaccine");
//		
//	}
//



}
