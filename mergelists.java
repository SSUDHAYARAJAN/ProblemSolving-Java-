import java.util.*;
class mergelists
{
	public static void main(String args[])
	{
		int a[][]={{1,6},{2,7},{3,5},{10,15},{14,20},{23,25}},i,j,start,end,temp[]=new int[2];
		//this merge operation perform only in sorted array
		List<Integer> al=new ArrayList <Integer>();
		
	    start=a[0][0];
		end=a[0][1];
	    for(i=0;i<a.length;i++)
		{
			if(a[i][0]<=end)
			{
				end=Math.max(a[i][1],end);
			}
			else
			{
				al.add(start);
				al.add(end);
				start=a[i][0];
				end=a[i][1];
			}
		}
		al.add(start);
		al.add(end);
		for(i=0;i<al.size();i=i+2)
			   System.out.print("["+al.get(i)+","+al.get(i+1)+"]");
		     
	}
}