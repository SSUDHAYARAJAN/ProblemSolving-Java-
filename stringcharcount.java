class stringcharcount
{
	public static void main(String args[])
	{
		String s="udhayarajan",s2="";
		int count,i,j,n=s.length();
		for(i=0;i<n;i++)
		{
			count=1;
		    if(!s2.contains(s.charAt(i)+""))
			{
				for(j=0;j<n;j++)
				{
					if(s.charAt(i)==s.charAt(j) && i!=j)
					{
						count++;
					}
				}
				if(count>1)
					s2+=s.charAt(i);
				System.out.println(s.charAt(i)+"-->"+count);
			}
		}
	}
}