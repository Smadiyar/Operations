package ConstractorsInfo;

public class StudentInfo {
	
	String name, lastName, major, hobby, favSubject, nationality, cityOfBirth;
	int dateOfBirth;
	long phoneNumber;
	char gender;
	
	
	public StudentInfo (String name, String lastName) {
		this("Kazashka");
		this.name=name;
		this.lastName=lastName;
		
	}
	
	public StudentInfo (int dateOfBirth, String cityOfBirth) {
		this("Dancing");
		this.dateOfBirth=dateOfBirth;
		this.cityOfBirth=cityOfBirth;
		
	}
	
	 public StudentInfo (String major, String hobby, String favSubject) {
		 this.major=major;
		 this.hobby=hobby;
		 this.favSubject=favSubject;
	 }
	 
	public StudentInfo (long phoneNumber) {
		this.phoneNumber=phoneNumber;
		
	}
	public StudentInfo (String nationality) {
		this(3/29/1995);
		this.nationality=nationality;
		
	}
	public StudentInfo (char gender) {
		this.gender=gender;
		
	}
	
	public String toString() {
		return new String ("My name is "+name+" and my last name is "+lastName+"."+" I was born in "+dateOfBirth+
				" in the "+cityOfBirth+" city. My nationality is "+nationality+" .I love "+hobby+" a lot.   ");
	}
	
	
	

}
