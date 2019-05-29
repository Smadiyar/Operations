package ArrayNewExplanation;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		Scanner str=new Scanner(System.in);
		
		String [] productName= {"Snickers", "Twix", "Mars", "Albeni", "Coke", "Sprite", "Water"};
		String [] productNumber= {"01", "02", "03", "04", "05", "06", "07", "08"};
		int [] productPrice= {3,4,1,2,5,6,7,8};
		
		String pNumber;
		int pPrice;
		
		System.out.println("Please enter the product number: ");
		
		pNumber=str.nextLine();
		for(int i=0; i<productName.length; i++) {
			if(productNumber[i].equals(pNumber)) {
				System.out.println("Please enter the product price " + productPrice[i]);
				pPrice=str.nextInt();
				if(productPrice[i]==pPrice) {
					System.out.println("Please enjoy the " + productName[i] );
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
//		
//
//	
//		productName[0]="Snickers";
//		productName[1]="Twix";
//		productName[2]="Mars";
//		productName[3]="Albeni";
//		productName[4]="Chips";
//		productName[5]="Coke";
//		productName[6]="Sprite";
//		productName[7]="Water";
//		productName[8]="Candy";
//			
//		
//		String [] numberOfProduct=new String[9];
//		
//		numberOfProduct[0]="01";
//		numberOfProduct[1]="02";
//		numberOfProduct[2]="03";
//		numberOfProduct[3]="04";
//		numberOfProduct[4]="05";
//		numberOfProduct[5]="06";
//		numberOfProduct[6]="07";
//		numberOfProduct[7]="08";
//     	numberOfProduct[8]="09";
//
//		
//		
//		String [] priceOfProduct=new String[9];
//		priceOfProduct[0]="$1";
//		priceOfProduct[1]="$2";
//		priceOfProduct[2]="$3";
//		priceOfProduct[3]="$4";
//		priceOfProduct[4]="$5";
//		priceOfProduct[5]="$6";
//		priceOfProduct[6]="$7";
//		priceOfProduct[7]="$8";
//		priceOfProduct[8]="$9";
//		
//		
////	int count=1;
//		for(int a =0; a<numberOfProduct.length; a++) {
//			System.out.println("Please enter the number of product: ");
//			numberOfProduct[a]=str.nextLine();
//		}
//		
//		
//	
//		for(int b=0; b<priceOfProduct.length; b++) {
//			System.out.println("Please enter the number of product: ");
//			priceOfProduct[b]=str.nextLine();
//		}
//			
//		
//
//		System.out.println(Arrays.toString(productName)+" Enjoy!");
//		
		
		
		
	}

}
