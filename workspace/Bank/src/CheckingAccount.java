public class CheckingAccount {
	private double balance;
	private String name;
	private Customer customer;
	
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

	public CheckingAccount(Customer customer, double balance, String name) {
		this.customer = customer;
		this.balance = balance;
		this.name = name;
	}
	
	public CheckingAccount(Customer customer) {
		this(customer, 0.0, "New account");
	}
	
	public double credit(double amount) {
		return balance += amount;
	}
	
	public double debit(double amount) {
		return balance -= amount;
	}
	
	public double transferTo(CheckingAccount other, double amount) {
		debit(amount);
		other.credit(amount);
		return balance;
	}
}
