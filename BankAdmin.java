
public class BankAdmin {
	
	void authoriseToChangeMobileNumber(BankAccount acct,String newMobileNo)
	{
		System.out.println("---------------");
		acct.setMobilenum(newMobileNo);
		System.out.println("Mobile number updated from "+acct.getMobilenum()+"to" +newMobileNo);
	}
	void authoriseToChangeAcctHolderName(BankAccount acct,String nameToUpdate)
	{
		System.out.println("---------------");
		acct.setAcctHolderName(nameToUpdate);
		System.out.println("Account holder name is updated as  "+nameToUpdate);
	}

	void processWithdrawl(BankAccount acct,double withdrawlAmt)
	{
		System.out.println("---------------");
		if(acct.getAcctBalance()>=withdrawlAmt)
		{	
		double newbal=acct.getAcctBalance()-withdrawlAmt;
		acct.setAcctBalance(newbal);
		System.out.println("New account balance after withdrawl of amount of" +withdrawlAmt+" is "+newbal);
		}
		else 
			throw new RuntimeException("Insufficient funds..."); 	
	}

	void processDeposit(BankAccount acct,double amtToDeposit)
	{
		System.out.println("---------------");
		double newbal=acct.getAcctBalance()+amtToDeposit;
		acct.setAcctBalance(newbal);
		System.out.println("New account balance after deposit of amount of" +amtToDeposit+" is "+newbal);
	}

	void processTransfer(BankAccount acct1,BankAccount acct2,double amtToTransfer)
	{
		System.out.println("---------------");
		if(acct1.getAcctBalance()>=amtToTransfer)
		{	
		double newacct1Balance=acct1.getAcctBalance()-amtToTransfer;
		double newacct2Balance=acct2.getAcctBalance()+amtToTransfer;
		
		System.out.println("After transfer of amount of "+amtToTransfer+" from "+acct1.getAcctHolderName()+" to "+acct2.getAcctHolderName()+" their respective balances are "+newacct1Balance+" and "+newacct2Balance);
		
		}
		else
			throw new RuntimeException("Insufficient funds..."); 	
	}

	

}
