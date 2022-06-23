import java.util.*;
class permutation
{
	static String input="345";
	static char ch[]=input.toCharArray();
	static int last=Integer.parseInt(input.charAt(input.length()-1)+"");
	static HashSet<Integer> hs=new HashSet<Integer>();
	static void swap(int i,int j)
	{
		char temp;
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	static void permute(int l,int r)
	{
		if(l==r)
		{
		  String s="";
		  for(int k=0;k<ch.length;k++)
			s+=ch[k]+"";
		  int value=Integer.parseInt(s);
		  while(value!=0)
		  {
			 if(value%last==0)
				hs.add(value);
			  value=value/10;
		  }
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				swap(l,i);
				permute(l+1,r);
				swap(l,i);
			}
		}
	}
	public static void main(String args[])
	{
		permute(0,ch.length-1);
		System.out.println(hs);
	}
}