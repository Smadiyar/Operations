package Techtorial;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		Scanner str=new Scanner (System.in);
	
		int n;
		
		System.out.println("Please enter any numbers: ");
		n=str.nextInt();
	if(n%2==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("Odd");
	}
	//  Ternory operator
	//String result= n%2==0 ? "Even" : "Odd";
		
		
		
	
	System.out.println("Please enter yor age: ");
	int age = 19;
	
	if(age >= 21) {
		System.out.println("Welcome to club!");
	}
	else {
		System.out.println("Sorry,not enough age!");
	}
	// Ternory operator
		//String result1=age>=19 ? "Welcome to club" : "Sorry, not enough age!";
		
		
		int x=19;
	String result2=x/3>4 ? "Good math skills" : "Need to practice more on Codingbat.";
		
		System.out.println(result2);
		
		
		
		
	}

}
