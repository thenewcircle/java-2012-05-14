
public class SavingsAccount extends DepositAccount {

	public SavingsAccount(Customer customer, double balance, String name) {
		super(customer, balance, name);
	}
	
	public SavingsAccount(Customer customer) {
		this(customer, 0.0, "New savings account");
	}

}
