package oops.abstraction;

public class HDFC implements RBI{

	@Override
	public void savingAccount() {
	System.out.println("HDFC Saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC Current Account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC Credit Card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC Debit Card");
		
	}

}
