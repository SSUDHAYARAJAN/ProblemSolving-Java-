//remove palindromes in word
class removepalindrome
{
	static boolean ispalin(String s2)
	{
		int i,j=s2.length()-1;
		for(i=0;i<s2.length()/2;i++)
		{
			if(s2.charAt(i)!=s2.charAt(j))
			{
				return false;
			}
			j--;
		}
		return true;
	}
	public static void main(String args[])
	{
		String s="Hari speaks malayalam",temp="",ans="";
		int i,j,n=s.length();
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)==' ')
			{
				if(!ispalin(temp))
				{
					ans+=temp+" ";
				}
				temp="";
			}
			else
			{
				temp+=s.charAt(i);
			}
		}
		if(!ispalin(temp))
		{
			ans+=temp+" ";
		}
		System.out.println(ans);
	}
}