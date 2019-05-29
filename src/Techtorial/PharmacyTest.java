package Techtorial;

public class PharmacyTest {
	public static void main(String[] args) {
		
		Pharmacy patient=new Pharmacy();
		patient.patientName="Tangsholpan";
		patient.patientLastName="Smadiyar";
		patient.DOB=1995;
		patient.patientAge=24;
		patient.patientGender='F';
		patient.drugName="Amoxicilin";
		patient.drugNumber=4;
		patient.drugPrice=20;
		patient.patientInsurance=false;
		patient.almondAllergy=true;
		
		
		patient.checkInsurance(patient.patientInsurance, patient.drugPrice);
		
		
		patient.checkAllergy(patient.almondAllergy);
		
		
		
		
		
		
		
		
	}

}
