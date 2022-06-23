class xpattern2
{
	public static void main(String args[])
	{
		String s="basic";
		int i,j,n=s.length();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					System.out.print(s.charAt(i));
				else if(i+j==n-1)
					System.out.print(s.charAt(n-i-1));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}