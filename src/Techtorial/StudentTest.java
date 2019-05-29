package Techtorial;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		
	Student student = new Student();

	Scanner str = new Scanner(System.in);
	
	student.calculateScore(50, 60, 70);//math
	student.calculateScore(80, 75);//bio
	student.calculateScore(50, 40, false);//CS 
	
	
	 System.out.println("Please enter your name: ");
	 student.name=str.nextLine();
	 
//	 System.out.println("Please enter your age: ");
//	 student.age=str.nextInt();
	 
	 System.out.println("Please enter the subject: ");
	 student.subject=str.next();
 
	 System.out.println("Please enter the grade: ");
	 student.grade=str.nextInt();
	 System.out.println("Please enter the grade: ");
	 student.grade=str.nextInt();
	 System.out.println("Please enter the grade: ");
	 student.grade=str.nextInt();
		
		
		
		
		
		
	}

}
