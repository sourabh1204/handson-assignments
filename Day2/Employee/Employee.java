class  Employee {
	String name;
	int id;
	double sal;
	Address addr;
	Employee(String name, int id, double sal, Address addr) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.addr = addr;
	}
	static void display(Employee[] e) {
		for(Employee t : e) {
			if(t.sal>50000) {
				System.out.println("Name: "+t.name);
				System.out.println("ID: "+t.id);
				System.out.println("Salary: "+t.sal);
				System.out.println("Address : "+t.addr.city+", "+t.addr.state+", "+t.addr.pin);
				System.out.println("-----------------------");
			}
		}
	}
}