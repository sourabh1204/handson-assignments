public class Account { 
    private long accountNumber;
    private double balance;

    /* withdraw must return the balance 
       and apply some conditions before deducting
    */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //System.out.println("Account(long, double) initialized");
    }
    public Account() {
        balance = 0.0;
        System.out.println("Account() intialized");
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() { 
        return balance; 
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(double amount) {
	this.balance = this.balance - amount;
	System.out.println("Amount debited from Acc No. : "+this.getAccountNumber());
    }

    /* deposit must return the balance
    */
    public void deposit(double amount) {
	this.balance = this.balance + amount;
	System.out.println("Amount deposited to Acc No. : "+this.getAccountNumber());
    }
    public void accountInformation() {
        System.out.println("---- Account Information ----");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}