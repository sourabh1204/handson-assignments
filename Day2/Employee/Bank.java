class Bank {
	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		Address add1 = new Address("Maharashtra", "Pune", 411039);
		Address add2 = new Address("Maharashtra", "Aurangabad", 411012);
		e[0] = new Employee("Naren",101,80000,add2);
		e[1] = new Employee("Piyush",102,90000,add1);
		e[2] = new Employee("Sid",103,85000,add2);
		e[3] = new Employee("Nikita",104,40000,add1);
		e[4] = new Employee("Rutuja",105,45000,add1);
		Employee.display(e);
	}
}