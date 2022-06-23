//Input: "12345 * + - + "
//Result: 6 [Explanation: 1 * 2 + 3 - 4 + 5 = 6]
class arithmetic
{
	public static void main(String args[])
	{
		String s="374291--*+-",n="",o="";
		int i,ans;
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='0' && s.charAt(i)<='9'))
				n+=s.charAt(i);
			else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
				o+=s.charAt(i);
		}
		ans=Integer.parseInt(n.charAt(0)+"");
		for(i=0;i<o.length();i++)
		{
			if(o.charAt(i)=='+')
				ans+=Integer.parseInt((n.charAt(i+1)+""));
			else if(o.charAt(i)=='-')
				ans-=Integer.parseInt((n.charAt(i+1)+""));
			else if(o.charAt(i)=='*')
				ans*=Integer.parseInt((n.charAt(i+1)+""));
			else if(o.charAt(i)=='/')
				ans/=Integer.parseInt((n.charAt(i+1)+""));
		}
		System.out.println(ans);
	}
}