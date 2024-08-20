package inheritancepack;

public class SBIBank extends Bank {
	
	public SBIBank() {
		super(11);
		System.out.println("SBI Bank construtor");
	}
	
	boolean goldLoan = true;
	
	public void sbiLoan() {
		System.out.println("SBI Loan generated");
	}

}
