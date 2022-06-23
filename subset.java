class subset
{
	public static void main(String args[])
	{
		String s="abcd",s2="";
		int num,j;
		for(num=0;num<Math.pow(2,s.length());num++)
		{
			    s2="";
				for(j=0;j<s.length();j++)
				{
				    //System.out.println(num & (1<<j));
					if((num & (1<<j))!=0)
						s2+=s.charAt(j);
				}
				System.out.println(s2);
		}
			
	}
}