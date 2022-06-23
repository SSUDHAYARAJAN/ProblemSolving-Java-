//Input (z){-2}oho
//Output ZZoho
//Input ((X){2}(y){3}(z)){2}
//Output xxyyyzxxyyyz
import java.util.*;
class paranthesis
{
	public static void main(String args[])
	{
		Stack<Character> st=new Stack<Character>();
		String s="((X){2}(y){3}(z){1}){2}";
		char ele='*';
		int value=0;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=')' && s.charAt(i)!='}')
				st.push(s.charAt(i));
			else
			{
				if(value!=0 && ele!='*')
				{
					for(int j=0;j<value;j++)
					{
						for(int k=0;k<temp.length();k++)
						   st.push(temp.charAt(k));
					}
					value=0;
					ele='*';
					temp="";
				}
				if(ele=='*' && s.charAt(i)==')')
				{
					while(st.peek()!='(')
					{
						temp+=st.pop();
					}
					ele='p';
					st.pop();
				}
				if(value==0 && s.charAt(i)=='}')
				{
					value=(int)st.pop();
					st.pop();
				}
			}
		}
		while(!st.empty())
		{
			System.out.println(st.pop());
		}
	}
}