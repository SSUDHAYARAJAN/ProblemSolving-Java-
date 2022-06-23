class subsequence
{
	//program to find the ranges of s2 in string s
	public static void main(String args[])
	{
		String s="ZOHOCORPORATION",s2="port";
		s=s.toLowerCase();
		s2=s2.toLowerCase();
		int min=s.length()-1,max=0,i,j,value=0;
		for(i=0;i<s2.length();i++)
		{
			for(j=0;j<s.length();j++)
			{
				if(s2.charAt(i)==s.charAt(j))
				{
					value=j;
				}
			}
			if(value>max)
			 max=value;
			if(value<min)
				min=value;
		}
	System.out.println("["+min+","+max+"]");
	}
}