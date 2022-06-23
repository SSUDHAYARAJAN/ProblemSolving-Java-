class pyramid
{
	public static void main(String args[])
	{
		int n=17,a[]=new int[n*2-1],i,j,start=n-1,end=n-1,k=0,space=n-1;
		for(i=n-1;i>=0;i--)
			a[k++]=i;
		for(i=1;i<n;i++)
			a[k++]=i;
		for(i=0;i<n;i++)
		{
			for(k=0;k<space*3;k++)
				System.out.printf(" ");
			for(j=start;j<=end;j++)
				System.out.printf("%3d",a[j]);
			System.out.println();
			start--;
			end++;
			space--;
		}
	}
}