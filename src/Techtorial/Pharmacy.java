package Techtorial;

public class Pharmacy {
	
	
	String patientName;
	String patientLastName;
	int DOB;
	int patientAge;
	char patientGender;
	String drugName;
	int drugNumber;
	int drugPrice;
	boolean patientInsurance;
	boolean almondAllergy;
	
	
	
	public void checkInsurance(Boolean patientInsurance, int drugPrice) {
		if(patientInsurance==true) {
			System.out.println("drug price is " +drugPrice%2);
		}else {
			System.out.println("Drug price is: " +drugPrice);
		}
	}
	
	
	public void checkAllergy (Boolean almondAllergy) {
		if(almondAllergy==true) {
			System.out.println("Patient can't use " + drugName);
		}else {
			System.out.println("Pattient can use " + drugName);
		}
	}
	
	
	

}
