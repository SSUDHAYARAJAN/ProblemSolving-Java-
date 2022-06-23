class mxnsquarepattern01
{
		public static void main(String a[])
		{
			int n=13,m=10,ele[]=new int[m],i,j,indent=1,count=m-1;
			for(i=0;i<m;i++)
			{
				ele[i]=0;
				System.out.print(ele[i]+" ");
			}
			System.out.println();
			for(i=1;i<n-1;i++)
			{
				for(j=indent;j<count;j++)
				{
					if(i%2==0)
						ele[j]=0;
					else
						ele[j]=1;
	
				}
				for(j=0;j<m;j++)
					System.out.print(ele[j]+" ");
				System.out.println();
				if(i>(n-2)/2)
				{
					count++;
					indent--;
				}
				else
				{
					count--;
					indent++;
				}
			}
			for(i=0;i<m;i++)
			{
				ele[i]=0;
				System.out.print(ele[i]+" ");
			}
				
		}
}