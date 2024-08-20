package inheritancepack;

public class Demo {

	public static void main(String[] args) {
		
		ICICIBank ibank = new ICICIBank();
		System.out.println(ibank.accountType1);
		System.out.println(ibank.accountType2);
		System.out.println(ibank.giftCard);
		ibank.depositMoney();
		ibank.transferMoney();
		ibank.withdrawMoney();
		ibank.iciciLoan();
		
	    HDFCBank hbank = new HDFCBank();
		System.out.println(hbank.accountType1);
		System.out.println(hbank.accountType2);
		System.out.println(hbank.flexideposits);
		hbank.depositMoney();
		hbank.transferMoney();
		hbank.withdrawMoney();
		hbank.hdfcLoan();
		

	}

}
