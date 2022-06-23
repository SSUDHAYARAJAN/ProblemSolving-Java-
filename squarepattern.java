import java.util.*;
class squarepattern
{
	static int n;
	public static void main(String args[])
	{
		System.out.print("enter n value for generate square pattern: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
	  if(n>1)
	  {
		int size=n*2-1,prev[]=new int[n],i,j,tempn=n;
		for(i=0;i<size;i++)
			System.out.printf("%2d ",n);
		System.out.println();
		
		for(i=0;i<n;i++)
			prev[i]=0;
		
		int nzerocount=0,k=n;
		for(i=0;i<size-2;i++)
		{
			nzerocount=0;
			if(i>((size-2)/2))
			{
				prev[--k]=0;
				tempn++;
			}	
			else
			{
				prev[i+1]=tempn;
				tempn--;
			}
			for(j=0;j<prev.length;j++)
			{
				if(prev[j]!=0)
				{
					System.out.printf("%2d ",prev[j]);
					nzerocount++;
				}
			}
			for(j=0;j<(size-(nzerocount*2));j++)
			{
				System.out.printf("%2d ",tempn);
			}
			for(j=prev.length-1;j>=0;j--)
			{
				if(prev[j]!=0)
				{
					System.out.printf("%2d ",prev[j]);
				}
			}
			System.out.println();
		}
		for(i=0;i<size;i++)
			System.out.printf("%2d ",n);
	  }
	  else if(n==1)
	  {
		  System.out.println(n);
	  }
	  else
	  {
		  System.out.println("n should be greater than zero");
	  }
	}
}