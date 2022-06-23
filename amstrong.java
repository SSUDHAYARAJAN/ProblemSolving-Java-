class amstrong
{
	public static void main(String args[])
	{
		//0,1,153.371 ....
		int n=371,temp=n,r,sum=0;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("yes Amstrong number");
		}
		else
		{
			System.out.println("NOt Amstrong number");
		}
	}
}