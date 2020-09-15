class TaxCal {
	public static void main(String[] args) {
		String[] states = {"MH","KA","AP","TN","MP"};
		int ch=0;
		double tax =0;
		double amt =0;
		for(int i=0; i<5; i++) {
			if(states[i]==args[0])
				ch=i;
		}
		switch(ch) {
			case 0 : 
				tax = Integer.parseInt(args[1])*0.1;
				amt = Integer.parseInt(args[1]) - tax;
				break;
			case 1 : 
				tax = Integer.parseInt(args[1])*0.12;
				amt = Integer.parseInt(args[1]) - tax;
				break;
			case 2 : 
				tax = Integer.parseInt(args[1])*0.15;
				amt = Integer.parseInt(args[1]) - tax;
				break;
			case 3 : 
				tax = Integer.parseInt(args[1])*0.17;
				amt = Integer.parseInt(args[1]) - tax;
				break;
			case 4 : 
				tax = Integer.parseInt(args[1])*0.2;
				amt = Integer.parseInt(args[1]) - tax;
				break;
		}
		System.out.println("Total Amount after Tax = "+amt);
				
	}
}