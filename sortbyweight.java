
/*2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number*/
import java.util.*;
class sortbyweight
{
	int first,second;
	sortbyweight(int f,int s)
	{
		first=f;
		second=s;
	}
	static int findweight(int k)
	{
		int w=0;
		if((Math.sqrt(k)-(int)Math.sqrt(k))==0)
			w+=5;
		if(k%4==0 && k%6==0)
			w+=4;
		if(k%2==0)
			w+=3;
		return w;
	}
	static void print(int a[],int n)
	{
		int i;
		sortbyweight ele[]=new sortbyweight[n];
		for(i=0;i<n;i++)
		{
			ele[i]=new sortbyweight(a[i],findweight(a[i]));
		}
		Arrays.sort(ele,new Comparator<sortbyweight>(){
		@Override
		public int compare(sortbyweight ob1,sortbyweight ob2)
		{
			return ob1.second<ob2.second?-1:1;
		}
		
		});
		for(i=0;i<n;i++)
		{
			System.out.println("ele="+ele[i].first+"weight="+ele[i].second);
		}
	}
	public static void main(String args[])
	{
		int a[]={10, 36, 54,89,12};
		print(a,a.length);
	}
}