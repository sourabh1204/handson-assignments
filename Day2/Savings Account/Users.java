class Users {
	public static void main(String[] args) {

		SavingsAcc u1 = new SavingsAcc(123456789L,"Pranay",40000,"Maharashtra","Pune",411034);
		SavingsAcc u2 = new SavingsAcc(987654321L,"Naren","Maharashtra","Aurangabad",411012);
		u1.display();
		u2.display();
		u2.deposit(987654321L,35000L);
		u1.withdraw(123456789L,3000L);
		u1.display();
		u2.display();
	}
}