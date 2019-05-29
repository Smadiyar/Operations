package Techtorial;

public class Animal {
	
		
		
		int eyes, leg, age;
//		int leg;
//		int age;
		boolean heart;
		String color, name;
//		String name;
		char gender;
		
		
		
		
		public void move() {
			
			
			
			
			
			System.out.println(name+ " is moving.");//method
		}
		
		
			public void eat() {
				
				
				System.out.println(name+ " is eating.");
				
			}
			
			
			public int increaseAge() {
				return age+2;
				
			}
			
			
			public String changeName() {
				return "Garfild";
			}
			
			public boolean cahgeHeart() {
				if(heart==true) {
					System.out.println(name+ "is alive.");
					return true;
				}
				return heart=false; //complicated
			}
			
			
			public String changeName2(String name) {
				name="Angela";
				System.out.println(name);
				return name;
			}
			
			public void changeName3(String name) {
				name="Fluffy";
				System.out.println(name);
				
			}
			
			
			
			
			public String giveNameToSnake(String name) {
		//	name="Python";
				System.out.println("The snake name is: " + name);	
				return name;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


