class alpha
{
	public static void main(String args[])
	{
		int n=299987,len=0,i,tempn=n;
		char ch='A';
		while(tempn!=0)
		{
			len++;
			tempn/=10;
		}
		if(n>26)
		{
			n=n%26;
			if(n==0)
				n=26;
		}
		for(i='A';i<='Z';i++)
		{
			if(n+64==i)
				ch=(char)i;
				
		}
		for(i=0;i<len;i++)
			System.out.print(ch);
	}
}