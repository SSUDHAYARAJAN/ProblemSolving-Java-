class Alphabets
{
	static int i,j;
	void X(int n)
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void U(int n)
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1|| i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void Y(int n)
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((i==j && i<n/2)|| i+j==n-1 )
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void A(int n)
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print("*");
				}
				else if(j==0 || j==n-1 )
				{
					System.out.print("*");
				}
				else if(i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
void I(int n)
{
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			if(i==0 || i==n-1)
			{
				System.out.print("*");
			}
			else if(j==n/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();	
}
void D(int n)
{
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			if(i==0 || i==n-1)
			{
				System.out.print("*");
			}
			else if(j+1==n/2 || j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	
}
	void H(int n)
	{
		for (i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				if(j==0||j==n-1)
				{
					System.out.print("*");
				}
				else if(i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
class xpattern
{
	public static void main(String args[])
	{
		int n=9;
		Alphabets a=new Alphabets();
		/*a.U(5);
		a.D(5);
		a.H(5);
		a.A(5);
		a.Y(5);
		a.A(5);*/
		String s="hello";
		n=s.length();
		//a.I(9);
		//a.H(9);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					System.out.print(s.charAt(i));
				else if(n-1==i+j)
					System.out.print(s.charAt(n-i-1));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}