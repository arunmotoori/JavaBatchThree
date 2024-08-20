package inheritancepack;

public class ICICIBank extends Bank {
	
	public ICICIBank() {
		super(5);
		System.out.println("ICICI Bank constructor");
	}
	
	boolean giftCard = true;
	
	public void iciciLoan() {
		System.out.println("ICICI Loan generated");
	}

}
