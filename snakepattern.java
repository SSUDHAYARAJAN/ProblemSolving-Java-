//n=4
//	1	2	3	4
// 	8	7	6	5	 
//	9	10	11	12	 	 
//	16	15	14	13	 
class snakepattern
{
	public static void main(String args[])
	{
		int n=4,i,j,v=1,prev=0;
		for(i=1;i<=n;i++)
		{
		   if(i%2==1)
		   {
			for(j=1;j<=n;j++)
			{
				System.out.printf("%3d",v);
				prev=v;
				v++;
			}
		   }
		   else
		   {
			  for(j=1;j<=n;j++)
			  {
				System.out.printf("%3d",v);
				prev=v;
				v--;
			 } 
		   }
		   v=prev+n;
			System.out.println();
		}
		
	}
}