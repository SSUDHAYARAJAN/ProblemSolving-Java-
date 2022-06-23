//Input : 2, -3, -4, 5, 9, 7, 8    Output: 2 5 9You should solve this question in O(n) time.
class previouselementsort
{
	public static void main(String args[])
	{
		int a[]= {2, -3, -4, 5, 9, 7, 8};
		int max=a[0];
		//System.out.println(max)
		for(int i=0;i<a.length;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
				System.out.println(max);
			}
		}
	}
}