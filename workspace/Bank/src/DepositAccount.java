public class DepositAccount {

	protected double balance;
	protected String name;
	protected Customer customer;

	public DepositAccount(Customer customer, double balance, String name) {
		this.balance = balance;
		this.name = name;
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double credit(double amount) {
		return balance += amount;
	}

	public double debit(double amount) {
		return balance -= amount;
	}

	public double transferTo(DepositAccount other, double amount) {
		debit(amount);
		other.credit(amount);
		return balance;
	}

	@Override
	public String toString() {
		String output =
			"Information for account " + getName() + '\n'
			+ "Owner: "
			+ getCustomer().getFirstName() + " "
			+ getCustomer().getLastName() + '\n'
			+ "Balance: " + getBalance();
		return output;
	}

}