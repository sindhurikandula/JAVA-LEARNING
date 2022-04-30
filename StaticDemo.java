
public class StaticDemo {

	public static void main(String[] args) {

		BankAccount1 ba1 = new BankAccount1(101, "sindhuri", 40000);
		ba1.printBankAccount();
		BankAccount1 ba2 = new BankAccount1(102, "shanvi", 40000);
		ba2.printBankAccount();
		BankAccount1 ba3 = new BankAccount1(103, "Keshav", 40000);
		ba3.printBankAccount();

	}

}

class BankAccount1 {

	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	static int noOfAcctOpened;

	BankAccount1(int x, String y, double z) {
		System.out.println("BankAccount(int,String,double)...constructor invoked....");

		if (x < 0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		} else
			accountNumber = x;

		if (y == null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		} else
			accountHolderName = y;

		if (z < 0) {
			// RuntimeException r = new RuntimeException("some problem.....");
			// throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		} else
			accountBalance = z;
		noOfAcctOpened++;
	}

	void printBankAccount() {
		System.out.println("Account Number  : " + accountNumber);
		System.out.println("Account HName   : " + accountHolderName);
		System.out.println("Account Balance : " + accountBalance);
		System.out.println("no of accounts opened: " + noOfAcctOpened);
		System.out.println("-------------------");

	}
}