class SavingsAcc {
	long accountNo;
	String name;
	double balance;
	String ifsc;
	String state;
	String city;
	int pinc;
	SavingsAcc(long acc, String n, double bal, String stat, String cit, int pin) {
		accountNo=acc;
		name=n;
		balance=bal;
		state=stat;
		city=cit;
		pinc=pin;
		ifsc="HSBC001";
	}
	SavingsAcc(long acc, String n, String stat, String cit, int pin) {
		accountNo=acc;
		name=n;
		balance=0;
		state=stat;
		city=cit;
		pinc=pin;
		ifsc="HSBC001";
	}
	void deposit(long acc, long amtd) {
		balance=balance+amtd;
		System.out.println("Available Balance after Deposit: "+balance+" INR");
		System.out.println("-------------------------------------------");
	}
	void withdraw(long acc, long amtw) {
		if(amtw<=balance) {
			balance=balance-amtw;
			System.out.println("Available Balance after Withdraw: "+balance+" INR");
			System.out.println("-------------------------------------------");
		}
		else {
			System.out.println("Low Balance");
			System.out.println("Available Balance: "+balance+" INR");
			System.out.println("-------------------------------------------");
		}
	}
	void display() {
		System.out.println("Account Number: "+accountNo);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance+" INR");
		System.out.println("IFSC: "+ifsc);
		System.out.println("Address: "+city+", "+state+" - "+pinc);
		System.out.println("-------------------------------------------");
	}
}