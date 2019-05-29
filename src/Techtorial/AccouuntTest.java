package Techtorial;

import java.util.Scanner;

public class AccouuntTest {
	public static void main(String[] args) {
		
		Accoount account=new Accoount();
		account.clientNAme="James";
		account.balance=0;
		
		Scanner str=new Scanner(System.in);
		
		System.out.println("Please enter the deposit amount: ");
//		account.deposit=str.nextInt();
//		
//		
//		System.out.println("Current deposit is: $" + account.deposit);
		account.addDeposit(str.nextInt());
		
		
		System.out.println("Please enter the deposit amount: ");
		account.addDeposit(str.nextInt());
		
		System.out.println("Please enter the deposit amount: ");
		account.addDeposit(str.nextInt());
		System.out.println("Please enter the deposit amount: ");
		account.addDeposit(str.nextInt());
		System.out.println("Please enter the deposit amount: ");
		account.addDeposit(str.nextInt());
		
	 
		System.out.println("Please enter the amount to withdraw: ");
		account.withdraw(str.nextInt());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
