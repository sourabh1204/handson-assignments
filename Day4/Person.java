public abstract class Person {
	private String name;
	private String dob;
	private char gender;
	private long phone;
	
	Address addr;

	public Person(String name, String dob, char gender, long phone, Address addr) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.addr = addr;
	}

	public String getName() {return this.name;}
	public String getDOB() {return this.dob;}
	public char getGender() {return this.gender;}
	public long getPhone() {return this.phone;}
	public String getAddress() {
		String address;
		address = addr.getCity()+", "+addr.getState()+", "+addr.getPin();
		return address;
	}

	public void testDisplay() {
		System.out.println("*** Displaying Information ***");
	}

	public void testUpdate() {
		System.out.println("*** Updating Information ***");
	}

	
}