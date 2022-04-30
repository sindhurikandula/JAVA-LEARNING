
public class BankingTest2 {

	public static void main(String[] args) {
		
		BankAccount acct = new BankAccount(110, "sindhuri", 50000, "9876543210");

		acct.permaddr = new Address("sector1 ", "Sanjeeva Nagar", "Nandyal", "Andhra Pradesh", "India", "502102");
		acct.corraddr = new Address("Sector40", "Seawoods", "Navi Mumbai", "Maharastra", "India", "501601");

		System.out.println(acct);

	}

}
