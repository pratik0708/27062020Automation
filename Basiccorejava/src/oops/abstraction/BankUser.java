package oops.abstraction;

public class BankUser {

	
	public static void main(String[] args) {
		
	
		account(new SBI());// SBI= Chrome
		account(new HDFC());//HDFC= Firefox
		account(new ICICI());//ICICI =Edge
		
		String name ="Pratik";
		RBI bank =new ICICI();
		int a=10;
		
		sum(a);
		message(name);
		account(bank);
		
		sum(20);
		message("Prachee");
		account(new SBI());
		
	}
	
	public static void account(RBI bank)// RBI = Webdriver
	{
		bank.creditCard();
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
		
	}
	
	public static void sum (int a) {
	}
	public static void message (String name)
	{
		System.out.println("Your name is "+ name);
	}
	
	
}
	