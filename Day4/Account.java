public class Account {
	private long accNo;
	private double balance;
	
	public Account(long accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public long getNumber() {return this.accNo;}
	public double getBalance() {return this.balance;}
	public void setBalance(double amount) {this.balance = amount;}

	public String getAccountDetails() {
		long accNo = this.getNumber();
		double balance = this.getBalance();
		String details = "Acc No.: "+accNo+" Balance: "+balance+" INR";
		return details;
	}

	public void withdraw(double amount) {
		if(this.getBalance() >= amount) {
			this.setBalance(this.getBalance()-amount);
			System.out.println("Amount has been withdrawn");
			System.out.println(this.getAccountDetails());
		}
		else
			System.out.println("Insufficient balance");
	}

	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		System.out.println("Amount has been deposited");
		System.out.println(this.getAccountDetails());
	}
}