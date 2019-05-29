package ArrayNewExplanation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNew {
	public static void main(String[] args) {
//	
//	
//	String[] productName=new String[12];
//	productName[0]="Bread";
//	productName[1]="Butter";
//	productName[2]="Chocolate";
//	productName[3]="Honey";
//	productName[4]="Lemon";
//	productName[5]="Salmon";
//	productName[6]="Spinach";
//	productName[7]="Tomato";
//	productName[8]="Cucumber";
//	productName[9]="Onion";
//	productName[10]="Milk";
//	productName[11]="Coffee";
//for(int i=0; i<productName.length; i++) {
//	System.out.println("Name of the product is: " + productName[i]);
//}
	
//	Scanner str=new Scanner (System.in);
//	
//    String[] nameOfProduct=new String [3];
//	int count=1;
//
//	
//	for(int a =0; a<nameOfProduct.length; a++) {
//		System.out.println("Please enter the " +count+ ". product");
//		 nameOfProduct[a]=str.nextLine();
//		 count++;
//	}
//		System.out.println(Arrays.toString(nameOfProduct));
//		
	
	
	
		//Sample1
		
		String [] soccerPlayer=new String[5];
		soccerPlayer[0]="Messi";
		soccerPlayer[1]="Ronaldo";
		soccerPlayer[2]="Beckham";
		soccerPlayer[3]="Suarez";
		soccerPlayer[4]="Pele";

		Arrays.sort(soccerPlayer);
		
		System.out.println(Arrays.toString(soccerPlayer));
	
		
		//Sample 2
	
		String []playerPower=new String[5];
		playerPower[0]="96";
		playerPower[1]="95";
		playerPower[2]="99";
		playerPower[3]="75";
		playerPower[4]="76";

		Arrays.sort(playerPower);
	System.out.println(Arrays.toString(playerPower));
	
	
	
	
	
	
	
	}
}
