 //Enter array size  :  8
   // Enter arryay elements  :  1 3 10 7 9 2 4 6
    //OUTPUT  :
    //1 2 3 4
import java.util.*;
class contineousrange
{
	public static void main(String args[])
	{
		int a[]={1 ,3 ,9 ,7 ,8,10,11,2 ,4 ,6},i,j,count=1,max=1;
		Arrays.sort(a);
		//1 2 3 4 6 7 8 9 10 11
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1]-1)
			{
				count++;
			}
			else
			{
				if(count>max)
				{
					max=count;
				}
				count=1;	
			}
		}
		if(count>max)
			max=count;
		System.out.println(max);
	}
}


