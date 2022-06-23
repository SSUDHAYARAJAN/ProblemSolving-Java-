class problem1
{
	public static void main(String args[])
	{
        int n=4,space=n-1,num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n;k++)
			{
				if(i%2==0)
				{
				System.out.print(num);
				num++;
				}
				else
				{
					System.out.print(num);
					num--;
				}
			}
			num=num+4;
			if(i%2==0)
				num--;
			else 
				num++;
			space--;
			System.out.println();
		}
	}
}