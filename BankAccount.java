
public class BankAccount {

	private int acctno;
	private String acctHolderName;
	private double acctBalance;
	private String mobilenum;
	
	Address permaddr;
	Address corraddr;
	
	public BankAccount(int acctno, String acctHolderName, double acctBalance, String mobilenum) {
		super();
		this.acctno = acctno;
		this.acctHolderName = acctHolderName;
		this.acctBalance = acctBalance;
		this.mobilenum = mobilenum;
	}

	@Override
	public String toString() {
		return "BankAccount [acctno=" + acctno + ", acctHolderName=" + acctHolderName + ", acctBalance=" + acctBalance
				+ ", mobilenum=" + mobilenum + ",permanent address=" +permaddr+ ",corrrespondence address ="+corraddr+"]";
	}

	public int getAcctno() {
		return acctno;
	}

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	
}
