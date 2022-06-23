class revwords
{
	public static void main(String args[])
	{
		String s="udhaya rajan is the great",temp="",ans="";int i,j;
		for(i=s.length()-1;i>=0;i--)
		{
				if(s.charAt(i)!=' ')
				{
					temp+=s.charAt(i);
					//System.out.println(temp);
				}
				else
				{
					for(j=temp.length()-1;j>=0;j--)
					{
						ans+=temp.charAt(j);
					}
					ans+=" ";
					temp="";
				}
		}
			for(j=temp.length()-1;j>=0;j--)
			{
				ans+=temp.charAt(j);
			}
			
			System.out.println(ans);
	}
}