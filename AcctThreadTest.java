
public class AcctThreadTest {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount(101,"sindhuri",50000,5000);
		SavingsAccount sb=new SavingsAccount(102,"Shanvi",60000,6000,4.5);
		CreditCardAccount cc=new CreditCardAccount(103,"jacky", 150000, 20000);
		
		/*ba.run();
		sb.run();
		cc.run();*/
          
		Thread t1=new Thread(ba);
		Thread t2=new Thread(sb);
		Thread t3=new Thread(cc);
			
		t1.start();
		t2.start();
		t3.start();
	
	}

}

class BankAccount extends Thread {
	protected int accountNumber;
	private String accountHolderName;
	public double accountBalance;
	public double amtToWithdraw;

	public BankAccount(int accountNumber, String accountHolderName, double accountBalance, double amtToWithdraw) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.amtToWithdraw = amtToWithdraw;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		System.out.println("getting the balance of Rs."+accountBalance +" for " +accountNumber);
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		System.out.println(" setting the balance for.." +accountNumber);
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public synchronized void withdrawl(double amtToWithdraw) {

		double currentBalance = getAccountBalance();
		System.out.println("-------------------------------------");
		System.out.println("Withdrawl(double) started for "+accountNumber);
		System.out.println("Calculating new balance for "+accountNumber);
		double newBalance = currentBalance - amtToWithdraw;
		setAccountBalance(newBalance);
		System.out.println("Withdrawl(double) finished for "+accountNumber);
		System.out.println("-------------------------------------");
		System.out.println("New balance for "+accountNumber +" is " +newBalance);
	}

	public void run() {
		
		System.out.println("withdrawl by bank account is invoked");
		withdrawl(amtToWithdraw);
	}

}

class SavingsAccount extends BankAccount implements Runnable {

	protected double rateOfIntrst;

	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance, double amtToWithdraw,
			double rateOfIntrst) {
		
		super(accountNumber, accountHolderName, accountBalance, amtToWithdraw);
		this.rateOfIntrst = rateOfIntrst;

	}
	
	

	@Override
	public String toString() {
		return "SavingsAccount [rateOfIntrst=" + rateOfIntrst + ", accountBalance=" + accountBalance
				+ ", amtToWithdraw=" + amtToWithdraw + "]";
	}



	double simpleIntCal() {
		return ((accountBalance * rateOfIntrst) / 100);
	}
	
	public void run() {
		
		System.out.println("withdrawl by savings bank account is invoked");
		withdrawl(amtToWithdraw);
	}

}

class CreditCardAccount extends BankAccount implements Runnable{

	double creditLimit;

	public CreditCardAccount(int accountNumber, String accountHolderName, double accountBalance, double amtToWithdraw)
	{
		super(accountNumber, accountHolderName, accountBalance, amtToWithdraw);
	}


	double CreditLimitCal() {

		if (accountBalance > 200000) {
			creditLimit = 0.3 * accountBalance;
			System.out.println("credit limit for "+accountNumber+" is " + creditLimit);
		}
		if (accountBalance > 100000 && accountBalance <=200000) {
			creditLimit = 0.2 * accountBalance;
			System.out.println("credit limit for "+accountNumber+" is " + creditLimit);
		} else {
			creditLimit = 0;
			System.out.println("credit card cannot be issued");
		}
		return creditLimit;
	}
	
	@Override
	public String toString() {
		return "CreditCardAccount [creditLimit=" + creditLimit + ", accountBalance=" + accountBalance + "]";
	}

	
	double withdrawCredit(double amtToWithdraw)
	{
		System.out.println("Withdrawl is in progress for an amount of Rs." + amtToWithdraw+" for "+accountNumber);
		if(amtToWithdraw<creditLimit)
		{	
			creditLimit = creditLimit - amtToWithdraw;
		System.out.println("withdrawl completed for an amount " + amtToWithdraw+" for "+accountNumber);
		System.out.println("New Credit Limit is" +creditLimit+ "for" +accountNumber);
		}
		else
			System.out.println("credit limit exceeded....amt cannot be withdrawn");
		
		return creditLimit;
	}
	
     public void run() {
		
		System.out.println("Withdrawl by credit card account is invoked");
		CreditLimitCal();
		 withdrawCredit(amtToWithdraw);
}
}

