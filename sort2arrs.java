class sort2arrs
{
	public static void main(String args[])
	{
		int a[]={1,6,9,3,0,3,67,64,78},b[]={1,2,3,4,5,6,7,8,9},i,j,temp;
		for(i=0;i<b.length;i++)
		{
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}