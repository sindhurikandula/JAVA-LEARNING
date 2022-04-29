
public class BankTest1 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(101, "sindhuri", 8000);
		b.printBankAccount();

		SavingsBankAccount sb = new SavingsBankAccount(102, "Shanvi", 90000, 3.5);
		sb.printBankAccount();
		double si = sb.simpleIntCal();
		System.out.println("si " + si);
		System.out.println("------------");

		FixedDepositAccount fd = new FixedDepositAccount(103, "Aashri", 100000, 7, 2);
		fd.printBankAccount();
		double a = fd.maturityAmtCal();
		System.out.println("maturity amount " + a);
		System.out.println("------------");

		CurrentAccount ca = new CurrentAccount(104, "Vardhan", 100000, 90000);
		ca.printBankAccount();

		CreditCard cc = new CreditCard(105, "Keshav", 200000);
		System.out.println("Details of customer applied for credit card are as follows");
		cc.printBankAccount();
		cc.CreditLimitCal();
		System.out.println("updated credit limit is "+cc.withdrawCredit(2000));

	}

}

class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private String mobileNumber;
	
	BankAccount(int x, String y, double z,String s)
	{
		this(x,y,z);
		if(s.length()==10)
		mobileNumber=s;
		else
	   throw new RuntimeException("Invalid Mobile Number...");
	
		
	}
	
	
	BankAccount(int x, String y, double z) {

		System.out.println("constructor for bank account is invoked");
		if (x < 0)
			throw new RuntimeException("Account number cannot be negative...terminating...");
		else
			accountNumber = x;

		if (y == null)
			throw new RuntimeException("Account holder name cannot be null...terminating...");
		else

			accountHolderName = y;

		if (z < 0)
			throw new RuntimeException("Account balance cannot be negative...terminating...");
		else
			accountBalance = z;
	}

	void printBankAccount() {
		System.out.println("Account number is " + accountNumber);
		System.out.println("Account Holder name is " + accountHolderName);
		System.out.println("Account balance is " + accountBalance);
		System.out.println("Mobile Number " + mobileNumber);
		System.out.println("------------");
	}

	double withdrawBal(double amtToWithdraw) {
		System.out.println("withdrawl is in progress" + amtToWithdraw);
		accountBalance = accountBalance - amtToWithdraw;
		System.out.println("withdrawl completed..." + amtToWithdraw);
		return accountBalance;

	}

	double depositBal(double amtToDeposit) {
		System.out.println("Deposit is in progress" + amtToDeposit);
		accountBalance = accountBalance + amtToDeposit;
		System.out.println("Deposit completed..." + amtToDeposit);
		return accountBalance;

	}

	double getBalance() {

		return accountBalance;

	}
	
	void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}
	
	String getMobileNumber()
	{
		return mobileNumber;
	}
	
	void changeAccountHolderName(String s)
	{
		accountHolderName=s;
	}

}

class SavingsBankAccount extends BankAccount {
	protected double rateOfIntrst;

	SavingsBankAccount(int x, String s, double y, double r) {
		super(x, s, y);

		System.out.println("constructor for savings bank account is invoked");

		if (r < 0)
			throw new RuntimeException("Rate of Interest cannot be negative...terminating...");
		else
			rateOfIntrst = r;
	}

	void printBankAccount() {
		super.printBankAccount();
		System.out.println("Rate of Interest is " + rateOfIntrst);

	}

	double simpleIntCal() {
		return ((accountBalance * rateOfIntrst) / 100);
	}

}

class FixedDepositAccount extends SavingsBankAccount {

	private int tenure;

	FixedDepositAccount(int x, String s, double y, double r, int t) {
		super(x, s, y, t);

		System.out.println("constructor for fixed deposit  is invoked");

		if (t < 0)
			throw new RuntimeException("tenure cannot be negative...terminating...");
		else
			tenure = t;
	}

	void printBankAccount() {
		super.printBankAccount();
		System.out.println("Tenure of FD is " + tenure);
	}

	double maturityAmtCal() {

		double x = Math.pow(1 + (rateOfIntrst / 100), tenure);
		double ma = accountBalance * x;
		return ma;
	}

}

class CurrentAccount extends BankAccount {

	private double overdraftLimit;

	CurrentAccount(int x, String s, double y, double l) {
		super(x, s, y);

		System.out.println("constructor for current account is invoked");

		if (l < 0)
			throw new RuntimeException("Rate of Interest cannot be negative...terminating...");
		else
			overdraftLimit = l;
	}

	void printBankAccount() {
		super.printBankAccount();
		System.out.println("over draft limit is " + overdraftLimit);
		System.out.println("------------");
	}

}

class CreditCard extends BankAccount {

	double creditLimit;

	CreditCard(int x, String s, double y) {
		super(x, s, y);
		System.out.println("constructor for credit card is invoked");

	}

	double CreditLimitCal() {

		if (accountBalance > 200000) {
			creditLimit = 0.3 * accountBalance;
			System.out.println("credit limit is " + creditLimit);
		}
		if (accountBalance > 100000 && accountBalance <=200000) {
			creditLimit = 0.2 * accountBalance;
			System.out.println("credit limit is " + creditLimit);
		} else {
			creditLimit = 0;
			System.out.println("credit card cannot be issued");
		}
		return creditLimit;
	}
	
	double withdrawCredit(double amtToWithdraw)
	{
		System.out.println("withdrawl is in progress" + amtToWithdraw);
		if(amtToWithdraw<creditLimit)
		{	
			creditLimit = creditLimit - amtToWithdraw;
		System.out.println("withdrawl completed..." + amtToWithdraw);
		}
		else
			System.out.println("withdrawl cannot happen");
		
		return creditLimit;
	}

}
