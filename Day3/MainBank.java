public class MainBank {
    public static void main(String[] args) {
       /*
        //pass the accountNo and amount to deposit from CLA
        //get the Account using the accountNo by calling getAccount(...)
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
	
	long accountNo = Long.parseLong(args[0]);
	double amount = Double.parseDouble(args[1]);
	Account acc = MainBank.getAccount(accountNo);
	if(acc != null) {
		acc.accountInformation();
		acc.deposit(amount);
		acc.accountInformation();
	}
	else
		System.out.println("Account not found. Enter vaild Account Number");
     */
	//Assignment-2 

	long accountNo1 = Long.parseLong(args[0]);
	long accountNo2 = Long.parseLong(args[1]);
	double amount = Double.parseDouble(args[2]);
	Account acc1 = MainBank.getAccount(accountNo1);
	Account acc2 = MainBank.getAccount(accountNo2);
	if(acc1 != null && acc2 != null) {
		if(acc1.getBalance() >= amount) {
			acc1.withdraw(amount);
			acc2.deposit(amount);
			System.out.println("Amount Transferred");
		}
		else
			System.out.println("Insufficient Balance");
	}
	else
		System.out.println("Account not found. Enter vaild Account Number");
	
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
	Account[] accounts = AccountsDB.getAccounts();
	for(Account t : accounts)
		if(t.getAccountNumber() == accountNo)
			return t;
	return null;
    }
}