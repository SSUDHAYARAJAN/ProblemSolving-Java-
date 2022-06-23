class zoho2
{
	public static void main(String ar[]){
	int a[]={1,3,2,5},b=0,n=a.length,prev[][]=new int[n*2][n],result[]=new int[n],i,j,k;
	for(i=0;i<n;i++)
	{
		k=0;
		prev[b][k]=a[i];
		//System.out.println("hey"+prev[b][k]);
		for(j=1+i;j<n;j++)
		{
			if(a[j-1]<a[j])
			{
				prev[b][++k]=a[j];
			}
		}
		b++;
	}
	for(i=0;i<n*2;i++)
	{
		for(j=0;j<prev[i].length;j++)
			System.out.print(prev[i][j]);
		System.out.println();
	}
	
	int len=0;
	for(i=0;i<n*2;i++)
	{
		k=0;
		if(prev[i].length>len)
		{
			for(j=0;j<prev[i].length;j++)
				if (prev[i][j]!=0)
					result[k++]=prev[i][j];
			len=prev[i].length;
		}
	}
	for(i=0;i<result.length;i++)
		if(result[i]!=0)
			System.out.print(result[i]+",");
}
}