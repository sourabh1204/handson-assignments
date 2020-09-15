class SumMaxMin {
	public static void main(String[] args) {
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			sum=sum+Integer.parseInt(args[i]);
			if(Integer.parseInt(args[i])<min)
				min=Integer.parseInt(args[i]);
			if(Integer.parseInt(args[i])>max)
				max=Integer.parseInt(args[i]);
		}
		System.out.println("Sum= "+sum);
		System.out.println("Max= "+max);
		System.out.println("Min= "+min);
	}
}