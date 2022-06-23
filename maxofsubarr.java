class maxofsubarr
{
	public static void main(String args[])
	{
		int k=10,max,i,j,arr[]={8,5,10,7,9,4,15,12,90,13,4,5,7,2,5,8,12,66,77,88,23,34,56,90,90,34,67},n=arr.length;
		for(i=0;i<n-k+1;i++)
		{
			max=0;
			for(j=i;j<(i+k);j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+",");
			
		}
	}
}