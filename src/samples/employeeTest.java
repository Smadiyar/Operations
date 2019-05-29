package samples;

public class employeeTest {
	public static void main(String[] args) {
		
		
		employee e1= new employee();
		e1.setName("Sarah");
		e1.setDateOfBirth("01/25/1998");
		e1.setLastName("Smith");
		e1.setGender("F");
		e1.setSSN(1234556789);
		
		System.out.println(e1.getName()+" is studying.");
		System.out.println(e1.getName()+ " "+e1.getLastName()+" is born in "+e1.getDateOfBirth());
		System.out.println(e1.getName()+"'s SSN is: "+e1.getSSN());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
