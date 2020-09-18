public class Employee extends Person{
	private double salary;

	public Employee(String name, String dob, char gender, long phone, Address addr, double salary) {
		super(name,dob,gender,phone,addr);
		this.salary = salary;
	}

	public double getSalary() {return this.salary;}
	public void setSalary() {
		this.salary = this.getSalary()+(this.getSalary()*0.1);
	}

	@Override
	public void testUpdate() {
		System.out.println("*** Updating Salary ***");
		this.setSalary();
		this.testDisplay();
	}
	
}