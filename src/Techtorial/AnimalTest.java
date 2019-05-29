package Techtorial;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
	Animal cat=new Animal();	
	
	cat.age=3;
	cat.name="Tom";
	cat.color="white";
	cat.eyes=2;
	cat.gender='M';
	cat.heart=true;
	cat.leg=4;
	cat.move();
	cat.eat();
	cat.age=cat.increaseAge();
	cat.name=cat.changeName();
	cat.heart=cat.cahgeHeart();
	
//
//	cat.name=changeName2(cat.name);
//	cat.name=changeName3("Borya");
	System.out.println(cat.color +"\n" +cat.gender+ "\n" + cat.name+ "\n" + cat.age);
		
		
	
	
	
	
	
	
	Animal snake=new Animal();
	
	snake.name=snake.giveNameToSnake("Cobra");
		
	
		
		
		
	}



}
