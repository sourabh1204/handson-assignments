class Result {
	public static void main(String[] args) {
		int n = args.length;
		int maxMarks = n*100;
		int total = 0;
		for(int i=0; i<n; i++) {
			total = total + Integer.parseInt(args[i]);
		}
		double per = total*100/maxMarks;
		System.out.println("Percentage % = "+per);
		if(per>=70)
			System.out.println("Grade: First Class with Distinction");
		else if(per>=60)
			System.out.println("Grade: First Class");
		else if(per >= 50)
			System.out.println("Grade: Second Class");
		else if(per>= 35)
			System.out.println("Grade: Pass");
		else
			System.out.println("Grade: Fail");
	}
}