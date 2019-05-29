package Techtorial;

public class Accoount {
	
	int deposit;
	int balance;
	String clientNAme;
	String accountNumber="1234567";
	int addedValue=10;
	
	
	
	public int addDeposit(int addAmount) {
		balance=balance+addAmount;
		System.out.println("Current deposit is: $" + balance);
		return balance;
	}
	

	public int withdraw(int withdrawMoney) {
		balance=balance-withdrawMoney;
		System.out.println("Current balance is: $" + balance);
		return balance;
	}
	

	public String changeAccountNumber(String number) {
		accountNumber=number;
		return accountNumber;
		
	}
	
	public static void main (String [] args) {
		Accoount account = new Accoount();
		account.changeAccountNumber(account.accountNumber);
		System.out.println(account.accountNumber);
		
	}
	
	

}
