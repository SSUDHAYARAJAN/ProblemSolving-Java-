//sum of two primenumbers =givennumber
class twoprime
{
	static boolean isprime(int k)
	{
		if(k==1)
		{
			return false;
		}
		else if(k==2)
		{
			return true;
		}
		else
		{
			int limit=(int)Math.sqrt(k);
			for(int i=2;i<limit;i++)
			{
				if(k%i==0)
					return false;
			}
			return true;
		}
	}
	public static void main(String args[])
	{
		int n=198796,a=n/2,b=n/2;
	    if(n%2==1)
			b++;
		while(a!=n && b!=1)
		{
			if(isprime(a) && isprime(b))
			{
				System.out.println(a+"+"+b+"="+n);
				return;
			}
			a++;
			b--;
		}
		System.out.println("no we cant");
	}
}