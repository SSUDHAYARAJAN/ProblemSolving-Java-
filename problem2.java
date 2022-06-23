class problem2
{
	//static String ans="";
	static String reverseandadd(String t)
	{
		String ans="";
		for(int i=t.length()-1;i>=0;i--)
		{
			ans+=t.charAt(i);
		}
		ans+=" ";
		return ans;
	}
	public static void main(String args[])
	{
		String s="one two three ",temp="",op="";
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!=' ')
				temp+=s.charAt(i);
			else
			{
				op+=reverseandadd(temp);
				temp="";
			}
		}
		System.out.println(op);
	}
}