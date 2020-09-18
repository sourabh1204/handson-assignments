public class Student extends Person {
	private int grade;
	
	public Student(String name, String dob, char gender, long phone, Address addr, int grade) {
		super(name,dob,gender,phone,addr);
		this.grade = grade;
	}

	public int getGrade() {return this.grade;}
	public void setGrade() {this.grade = (this.getGrade()+1);}
	
	@Override
	public void testDisplay() {
		System.out.println("*** Displaying Information ***");
		System.out.println("Name of the Student: "+this.getName());
		System.out.println("DOB: "+this.getDOB()+" , Gender: "+this.getGender());
		System.out.println("Grade: "+this.getGrade()+" , Phone No.: "+this.getPhone());
		System.out.println("Address: "+this.getAddress());
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public void testUpdate() {
		System.out.println("*** Updating Grade ***");
		this.setGrade();
		this.testDisplay();
	}
}