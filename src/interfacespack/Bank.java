package interfacespack;

public interface Bank {
	
	String accountType1 = "Savings"; // static and final by default
	int accountBalance = 500000; // static and final by default
	
	public void openAccount();  // abstract by default
	public void depositMoney();
	public void withdrawMoney();
	public void transferMoney();
	public void closeAccount();
	
	default void generateStatement() {
		System.out.println("Generate Account Statement");
	}
	
	public static void openFlexiDeposit() {
		System.out.println("Open Flexi Fixed Deposit");
	}
}

class SBIBank implements Bank{

	public void openAccount() {
		System.out.println("Account openened in SBI Bank");		
	}

	public void depositMoney() {
		System.out.println("Money deposited in SBI Bank");
	}
	
	public void withdrawMoney() {
		System.out.println("Money withdrawn from SBI Bank");
	}

	public void transferMoney() {
		System.out.println("Money transferred from SBI Bank");
	}

	public void closeAccount() {
		System.out.println("Account closed in SBI Bank");
	}
	
	public void generateStatement() {
		System.out.println("Account Statement generated in SBI Bank");
	}
	
	
}

class HDFCBank implements Bank {
	
	public void openAccount() {
		System.out.println("Opening HDFC Bank Account");
	}
	
	public void depositMoney() {
		System.out.println("Depositing Money in HDFC Bank");
	}
	
	public void withdrawMoney() {
		System.out.println("Money withdrawn from HDFC Bank");
	}
	
	public void transferMoney() {
		System.out.println("Money transferred to HDFC Bank");
	}
	
	public void closeAccount() {
		System.out.println("Closing HDFC Bank Account");
	}
	
}
