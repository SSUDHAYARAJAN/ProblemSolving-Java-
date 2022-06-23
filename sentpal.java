class sentpal
{
	static boolean gocheck(String s)
	{
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		if(s.equals(s2))
			return true;
		else
			return false;
	}
	public static void main(String ars[])
	{
		String sent="the level of image beauty",temp="";
		boolean flag=false;
		for (int i=0;i<sent.length();i++)
		{
			if(sent.charAt(i)==' ' || i==sent.length()-1)
			{
				if(i==sent.length()-1)
				{
					temp+=sent.charAt(sent.length()-1);
				}
				flag=gocheck(temp);
				if (flag)
				{
					System.out.println("yes, sentance contain palindrome");
					break;
				}
				temp="";
				continue;
			}
			temp+=sent.charAt(i);
			
		}
		if(flag==false)
		{
			System.out.println("no, sentance doesnot contain any palindrome");
		}
	}
}