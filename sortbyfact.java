import java.util.*;
class sortbyfact
{
	int element,count;
	sortbyfact(int ele,int count)
	{
		this.element=ele;
		this.count=count;
	}
	static int findcount(int k)
	{
		int c=0;
		for(int i=1;i<=k;i++)
		{
			if(k%i==0)
				c++;
		}
		return c;
	}		
	static void print(int n[],int len)
	{
		int i;
		sortbyfact ele[]=new sortbyfact[len];
		for (i=0; i<len; i++)
        {
            ele[i] = new sortbyfact(n[i],findcount(n[i]));
        }
		Arrays.sort(ele,new Comparator<sortbyfact>(){
			@Override
			public int compare(sortbyfact e1,sortbyfact e2)
			{
				if(el.count==e2.count)
					return e1.element>e2.element?-1:1;
				return e1.count>e2.count?-1:1;
			}
		});
		for(i=0;i<len;i++)
			System.out.println(ele[i].element);
		
	}
	public static void main(String args[])
	{
		int a[]={6,8,9};
		print(a,a.length);
	}
}