
public class BankingTest1 {

	public static void main(String[] args) {
		
		BankAccount acct1=new BankAccount(101,"sindhuri",50000,"9491409310");
		BankAccount acct2=new BankAccount(102,"shanvi",60000,"9000036834");
		BankAccount acct3=new BankAccount(103,"Aashri",80000,"9491409311");
		
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
		
	    BankAdmin admin=new BankAdmin();
		admin.authoriseToChangeAcctHolderName(acct3,"Aashrith");
		System.out.println(acct3);
		
		admin.authoriseToChangeMobileNumber(acct2, "9876543210");
		System.out.println(acct2);
		
		admin.processWithdrawl(acct1, 50000);
		System.out.println(acct1);
		
		admin.processDeposit(acct2, 2000);
		System.out.println(acct2);
		
		admin.processTransfer(acct1, acct2,2000);
		System.out.println(acct1);
		System.out.println(acct2);
	}

}
