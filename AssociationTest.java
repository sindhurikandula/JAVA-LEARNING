
public class AssociationTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(101, "sindhuri", 50000, "9491409310");
		b.printBankAccount();
		BankAdmin ba = new BankAdmin();
		ba.changeOfMobileNumber(b, "9000036834");
		ba.changeOfAcctHolderName(b, "sindhu");
		ba.deposit(b, 5000);
		ba.withdrawl(b, 7000);
		b.printBankAccount();

	}

}

class BankAdmin {
	void changeOfMobileNumber(BankAccount x, String s) {
		
		System.out.println("Updating mobile number to.... "+s);
		x.setMobileNumber(s);
		//x.printBankAccount();
	}

	void changeOfAcctHolderName(BankAccount x, String s) {
		System.out.println("Changing account holder name to... "+s);
		x.changeAccountHolderName(s);
		System.out.println("----------------------");
		//x.printBankAccount();
	}

	void deposit(BankAccount x, double d) {
		x.depositBal(d);
		System.out.println("----------------------");
		//x.printBankAccount();
	}

	void withdrawl(BankAccount x, double w) {
		x.withdrawBal(w);
		System.out.println("----------------------");
		//x.printBankAccount();
	}
}