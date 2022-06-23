class countchars
{
	public static void main(String args[])
	{
		/*int n=1000,v=9,tv=v,sum=1,k=1;
		while(v!=0)
		{
			sum+=v*k;
			v=n-tv;
			tv+=v;
			k++;
		}*/
		int sum=0,n=1000,temp=n,p=1,k=1,len=0;
		while(temp!=0)
		{
			len++;
			temp/=10;
		}
		temp=0;
		for(int i=0;i<len-1;i++)
		{
			
			sum+=9*k*p;
			temp+=9*p;
			k++;
			p=p*10;
		}
		System.out.println(sum+(n-temp)*len);
	}
}