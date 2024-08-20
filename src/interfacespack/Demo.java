package interfacespack;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Bank.accountType1);
		System.out.println(Bank.accountBalance);
		
		SBIBank sbiBank = new SBIBank();
		sbiBank.openAccount();
		sbiBank.depositMoney();
		sbiBank.withdrawMoney();
		sbiBank.transferMoney();
		sbiBank.closeAccount();
		sbiBank.generateStatement();
		
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.openAccount();
		hdfcBank.depositMoney();
		hdfcBank.withdrawMoney();
		hdfcBank.transferMoney();
		hdfcBank.closeAccount();
		hdfcBank.generateStatement();
		
		Bank.openFlexiDeposit();

	}

}
