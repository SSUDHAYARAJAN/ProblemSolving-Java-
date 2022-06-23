/* 1  
  3 2
 6 5 4
10 9 8 7
10 9 8 7 
 6 5 4 
  3 2 
   1   */
class pattern1
{
	public static void main(String args[])
	{
		int n=12,prev=1,start=1,space=n-1,i,j,temp=1,count=1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<space;j++)
				System.out.print(" ");
			for(j=0;j<count;j++)
			{
				System.out.printf("%2d ",start);
				prev=start;
				start--;
			}
			if(i==n-1)
			{
				System.out.println();
				start=prev+n-1;
				for(j=0;j<n;j++)
				{
					System.out.printf("%2d ",start);
					start--;
				}
				
			}
				
			start=prev+temp*2;
			temp++;
			space--;
			count++;
			System.out.println();
		}
		count=n-1;
		start=prev-1;
		space=1;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<space;j++)
				System.out.print(" ");
			for(j=0;j<count;j++)
			{
				System.out.printf("%2d ",start);
				prev=start;
				start--;
			}
			count--;
			space++;
			start=prev-1;
			System.out.println();
		}
		
	}
}