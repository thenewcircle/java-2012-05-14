public class CheckingAccount extends DepositAccount {
	public CheckingAccount(Customer customer, double balance, String name) {
		super(customer, balance, name);
	}
	
	public CheckingAccount(Customer customer) {
		this(customer, 0.0, "New checking account");
	}
}
