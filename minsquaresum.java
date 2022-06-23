class minsquaresum
{
	public static void main(String args[])
	{
		int n=12;
		int start,count=0;
		while(n!=0)
		{
			start=(int)Math.sqrt(n);
			n=n-start*start;
			count++;
		}
		System.out.println("minimum square sum="+count);
	}
}