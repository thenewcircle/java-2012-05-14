public class Customer {
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Customer(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSsn() {
		return ssn;
	}
}
