class twoarraysum
{
	public static void main(String args[])
	{
		int a[]={9 ,2 ,8, 1, 3, 5, 6, 7, 3, 1, 1, 6},b[]={7,8, 4, 6, 2, 1, 9, 9, 7},maxlen=a.length>b.length?a.length:b.length,c[]=new int[maxlen],d[]=new int[maxlen],i,j;
		int minlen=a.length<b.length?a.length:b.length;
		boolean amax=false,bmax=false;
		if(a.length>b.length)
		{
			amax=true;
		}
		else
		{
			bmax=true;
		}
		for(i=0;i<maxlen-minlen;i++)
		{
			c[i]=0;
		}
		if(!amax)
		{
			int l=0;
			for(i=maxlen-minlen;i<maxlen;i++)
			{
				c[i]=a[l++];
			}
			for(int k=0;k<maxlen;k++)
			{
				d[k]=b[k];
			}
		}
		else
		{
			int l=0;
			for(i=maxlen-minlen;i<maxlen;i++)
			{
				c[i]=b[l++];
			}
			for(int k=0;k<maxlen;k++)
			{
				d[k]=a[k];
			}
		}
		for(i=0;i<maxlen;i++)
			System.out.print(c[i]);
		System.out.println();
		for(j=0;j<maxlen;j++)
			System.out.print(d[j]);
		int ans[]=new int[maxlen],carry=0,sum;
		for(i=maxlen-1;i>=0;i--)
		{
			sum=0;
			sum=c[i]+d[i]+carry;
			if(sum<10)
			{
				ans[i]=sum;
				carry=0;
			}
			else
			{
				ans[i]=sum%10;
				carry=sum/10;
			}	
		}
		System.out.println();
		for(i=0;i<maxlen;i++)
			System.out.print(ans[i]);
	}
}