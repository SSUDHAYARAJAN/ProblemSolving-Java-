class cricket
{
	public static void main(String args[])
	{
		String s="1.4.6 N ....3 2 1466W66N3 21",strike="p1";
		int p1=0,p2=0,i,n=s.length(),extra=0;
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)!=' ')
			{
				if(s.charAt(i)=='.')
				{
					continue;
				}
				else if(s.charAt(i)=='W' || s.charAt(i)=='N')
				{
					extra++;
					continue;
				}
				else
				{
					if((Integer.parseInt(s.charAt(i)+""))%2==1)
					{
						if(strike.equals("p1"))
						{
							p1+=Integer.parseInt(s.charAt(i)+"");
							strike="p2";
						}
						else
						{
							p2+=Integer.parseInt(s.charAt(i)+"");
							strike="p1";
						}
					}
					else
					{
						if(strike.equals("p1"))
						{
							p1+=Integer.parseInt(s.charAt(i)+"");
						}
						else
						{
							p2+=Integer.parseInt(s.charAt(i)+"");
						}
					}
				}
			}
		}
		System.out.println("player1="+p1);
		System.out.println("player2="+p2);
		System.out.println("extras="+extra);
	}
}