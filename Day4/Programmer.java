public class Programmer extends Manager{
	
	public Programmer(String name, String dob, char gender, long phone, Address addr, int salary) {
		super(name,dob,gender,phone,addr,salary);
	}

	@Override
	public void testDisplay() {
		System.out.println("*** Displaying Information ***");
		System.out.println("Name of the Programmer: "+this.getName());
		System.out.println("DOB: "+this.getDOB()+" , Gender: "+this.getGender());
		System.out.println("Salary: "+this.getSalary()+" INR, Phone No.: "+this.getPhone());
		System.out.println("Address: "+this.getAddress());
		System.out.println("-----------------------------------------------------");
	}
}