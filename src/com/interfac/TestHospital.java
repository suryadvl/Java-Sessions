package com.interfac;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.DermaServices();
		fh.ENTServices();
		fh.medicalTraining();
		fh.neuroServices();
		fh.orthoServices();
		fh.oncologyServices();
		fh.physioServices();
		fh.pathologyServices();
		fh.pediaServices();
		fh.emergencyServices();
	//	fh.covidVaccination();
		// inherited method 
		fh.medicalTest();
		
		// interface name we can call static method
		USMedical.billing();
		
		// methiod hiding 
		fh.billing();
		
		
		// Top casting
	 	// child class  object can be referred by parent interface  reference variable
		// down casting is not allowed
		
	 	
	 	 USMedical us = new FortisHospital();
		 us.physioServices();
		 us.oncologyServices();
		 us.dentalServices();
		 us.emergencyServices();
		 
	

		

	}

}

