class zoho5
{
	public static void main(String ar[])
	{
		int n=5,a[n][2]={{5,24},{39,60},{15,28},{50,90}},i,count=0;
		for(i=0;i<n;i++)
		{
			if(a[i][1]<a[i+1][0])
				count++;
		}
		System.out.print("count="+count);
	}
}