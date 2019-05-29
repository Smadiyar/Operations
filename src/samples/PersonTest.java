package samples;

public class PersonTest {
	public static void main(String[] args) {
		
		Person person = new Person();
		
		
		person.name="John";
		person.age=25;
		person.gender='M';
		person.job="SDET";
		person.salary=130000;
		
		person.run(10);
		person.swim();
		person.personJobDetails();
		
		
		
		
		Person person2 = new Person();
		System.out.println("========Second object============");
		person2.name="Tim";
		person2.age=35;
		person2.gender='M';
		person2.job="Developer";
		person2.salary=135000;
		
		person2.personJobDetails();
		
		System.out.println(person.name+" and "+person2.name+" are working in IT industry.");
		
		
	}

}
