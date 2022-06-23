import java.util.*;
class alternatesort
{
	int first,second;
	alternatesort(int f,int s)
	{
		first=f;
		second=s;
	}
	static void print(int a[],int b[],int n)
	{
		int i;
		alternatesort ele[]=new alternatesort[n];
		for(i=0;i<n;i++)
		{
			ele[i]=new alternatesort(a[i],b[i]);
		}
		Arrays.sort(ele,new Comparator<alternatesort>(){
		@Override
		public int compare(alternatesort ob1,alternatesort ob2)
		{
			return ob1.second>ob2.second?-1:1;
		}
		
		});
		for(i=0;i<n;i++)
		{
			System.out.println(ele[i].first);
		}
	}
	static int factcount(int k)
	{
		int count=0;
		for(int i=1;i<=k;i++)
		{
			if(k%i==0)
				count++;
		}
		return count;
	}
	public static void main(String args[])
	{
		int a[]= {6,8,9,12},b[]=new int[a.length];
		//sort the array a based on array b
		for(int i=0;i<a.length;i++)
			b[i]=factcount(a[i]);
		print(a,b,a.length);
	}
}