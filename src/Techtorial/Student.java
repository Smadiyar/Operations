package Techtorial;

public class Student {
	
	
	String name;
	int age;
	int grade;
	String subject;
	int score;
	
	
	
	public void calculateScore(int exam1, int exam2, int exam3) {
		int totalScore=exam1+exam2+exam3;
		int average=totalScore/3;
		if(average>70) {
			System.out.println("You are able to go with math to next semester");
		}
		else if(average>=50 && average<70) {
			System.out.println("You are able to go with math to the next semester but with less credits");
			
		}
		else {
			System.out.println("You are not able to go with mathto the next semester");	
		}
		
	}
	
	public void calculateScore(int exam1, int exam2) {
		int totalScore=exam1+exam2;
		int average=totalScore/2;
		if(average>=80) {
			System.out.println("You are able to go with biology to next semester");
		}
		else if(average>=55 && average<80) {
			System.out.println("You are able to go with biology to the next semester but with less credits");
			
		}
		else {
			System.out.println("You are not able to go with biology to the next semester");	
		}	
	}
	
	public void calculateScore(int exam1, int exam2, boolean assignment) {
		int totalScore=exam1+exam2;
		int average=totalScore/2;
		if(average>=75 && assignment==true) {
			System.out.println("You are able to go with CS to next semester");
		}
		else if(average>=50 && average<75 && assignment==true) {
			System.out.println("You are able to go to the next semester with CS  but with less credits");
			
		}
		else if(average>=50 && assignment==false){
			System.out.println("You are not able to go with CS to the next semester");	
		}	
	}
	
	
	
	
	
	

}
