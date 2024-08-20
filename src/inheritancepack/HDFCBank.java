package inheritancepack;

public class HDFCBank extends Bank{
	
	public HDFCBank() {
		super(9);
		System.out.println("HDFC Bank constructor");
	}
	
	boolean flexideposits = true;
	
	public void hdfcLoan() {
		System.out.println("HDFC Loan generated");
	}
	
}
