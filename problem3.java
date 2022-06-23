import java.util.*;
class problem3
{
	static int calculate(int a,int b,char operator)
	{
		if(operator=='+')
			return a+b;
		else if(operator=='-')
			return a-b;
		else if(operator=='/')
			return a/b;
		else
			return a*b;
	}
	public static void main(String args[])
	{
		String s="235+*",num="",ope="";
		int len=s.length();
		Scanner sc=new Scanner(System.in);
		//s=sc.nextLine();
		/*
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=68)
				num+=s.charAt(i);
			else
				ope+=s.charAt(i);
		}
		int ans=(int)(num.charAt(0))-48,next,j=1;
		for(int i=0;i<ope.length();i++)
		{
			
			
			next=(int)(num.charAt(j++))-48;
			ans=calculate(ans,next,ope.charAt(i));
		}
		System.out.println(ans);*/
		int ans=(int)(s.charAt(0))-48,next,j=1;
	
		for(int i=len/2+1;i<len;i++)
		{
			next=(int)(s.charAt(j++))-48;
			ans=calculate(ans,next,s.charAt(i));
		}
		System.out.println(ans);
	}
}