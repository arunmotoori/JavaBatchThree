package inheritancepack;

public class Bank {
	
	public Bank(int a) {
		System.out.println("Bank constructor"+a);
	}
	
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	public void depositMoney() {
		System.out.println("Money got deposited");
	}
	
	public void transferMoney() {
		System.out.println("Money got transferred");
	}
	
	public void withdrawMoney() {
		System.out.println("Money got withdrawn");
	}
	

}
