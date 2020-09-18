public class Customer extends Person {
	
	Account acc;
	public Customer(String name, String dob, char gender, long phone, Address addr, Account acc) {
		super(name,dob,gender,phone,addr);
		this.acc = acc;
	}
	

	@Override
	public void testDisplay() {
		System.out.println("*** Displaying Information ***");
		System.out.println("Name of the Customer: "+this.getName());
		System.out.println("DOB: "+this.getDOB()+" , Gender: "+this.getGender());
		System.out.println(this.acc.getAccountDetails());
		System.out.println("Phone No.: "+this.getPhone());
		System.out.println("Address: "+this.getAddress());
		System.out.println("-----------------------------------------------------");
	}
	
	public void testWithdraw(double amount) {
		this.acc.withdraw(amount);
	}

	public void testDeposit(double amount) {
		this.acc.deposit(amount);
	}

}