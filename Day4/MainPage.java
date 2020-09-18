public class MainPage {
	public static void main(String[] args) {
		Address addr1 = new Address("Maharashtra","Pune",411039);
		Address addr2 = new Address("Maharashtra","Aurangabad",411012);
		Address addr3 = new Address("Maharashtra","Solapur",411008);
		
		Account acc = new Account(55555L,75000);

		Person p1 = new Student("Sourabh","12-4-98",'M',1234567890L,addr1,9);
		Person p2 = new Manager("Naren","5-5-90",'M',9876543210L,addr2,50000);
		Person p3 = new Programmer("Piyush","18-9-98",'M',9871234560L,addr3,25000);
		Person p4 = new Admin("Nikita","12-5-98",'F',9860444259L,addr1,50000);
		Person p5 = new Customer("Rutuja","20-2-98",'F',9049181405L,addr2,acc);

		p1.testDisplay();
		p2.testDisplay();
		p3.testDisplay();
		p4.testDisplay();
		p5.testDisplay();

		p1.testUpdate();
		p2.testUpdate();
		p3.testUpdate();
		p4.testUpdate();
	}
}