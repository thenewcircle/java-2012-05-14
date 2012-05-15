public class CheckingTest1 {

	/**
	 * A simple test program for our custom CheckingAccount class.
	 * @param args
	 */
	public static void main(String[] args) {
		// Create two customers
		Customer customer1 = new Customer("Ken", "Jones", "123-45-6789");
		Customer customer2 = new Customer("Jane", "Doe", "987-65-4321");
		
		// Create the first CheckingAccount belonging to customer1
		CheckingAccount account1
			= new CheckingAccount(customer1);
		
		// Create the second CheckingAccount belonging to customer2
		SavingsAccount account2
			= new SavingsAccount(customer2, 5000.0, "Joint savings");
		
		// Perform transactions on the first account
		account1.credit(600);
		account1.debit(1500);
		
		// Perform transactions on the second account
		account2.credit(500);
		account2.debit(100);
		
		// Transfer money from account2 to account1
		account2.transferTo(account1, 1000);
		
		// Report information for the first account
		printAccount(account1);
		
		// Print a blank line
		System.out.println();
		
		// Report information for the second account
		printAccount(account2);
	}

	private static void printAccount(DepositAccount account) {
		System.out.println(account);
	}

}
