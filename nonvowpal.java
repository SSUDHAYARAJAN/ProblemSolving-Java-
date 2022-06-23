class nonvowpal
{
	public static void main(String args[])
	{
		String s1="AMkmA",s2="",s3="";
		s1=s1.toLowerCase();
		for (int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)!='a')&&(s1.charAt(i)!='e')&&(s1.charAt(i)!='i')&&(s1.charAt(i)!='o')&&(s1.charAt(i)!='u'))
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3+=s2.charAt(i);
		}
		System.out.println(s3);
		if(s3.equals(s2))
			System.out.println("palindrome");
		else
			System.out.println("nonpalvolvel");
	}
}