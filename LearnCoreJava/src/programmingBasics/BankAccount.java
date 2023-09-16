package programmingBasics;

public class BankAccount {
	
	Long accountNumber = 1234567890l;
	String accountHolderName = "Vijay";
	int accountBalance = 5903;
	
	public int getAccountDetails() {
		System.out.println("Account Holder Name is "+ accountHolderName);
		return accountBalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		 int totalAmount = account.getAccountDetails();
		 System.out.println("Total Balance is "+totalAmount);
	}
}
