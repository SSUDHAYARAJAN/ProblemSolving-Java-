class numberpattern
{
	public static void main(String ar[])
	{
		int n=10,i,j,dif,temp;
		for(i=0;i<n;i++)
		{
			temp=i+1;
			dif=n;
			for(j=i;j<n;j++)
			{
				System.out.print(temp+"  ");
				temp=temp+dif;
				dif--;
			}
			System.out.println();
		}
		int a[]={2,-3,-4,5,9,7,8};
		System.out.print(a[0]+",");
		for(i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
				System.out.print(a[i]+",");
		}
		
	}
}