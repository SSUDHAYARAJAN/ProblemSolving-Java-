class searching2d
{
	public static void main(String argss[])
	{
		char a[][]={{'u','d','h','a','y','a'},{'a','k','a','s','h','s'},{'a','s','w','i','n','i'},{'u','r','m','i','l','a'}};
		int i,j,k,rowlen=a.length,collen=a[0].length;
		String s="ini";
		int slen=s.length();
		int r,c;
		boolean flag;
		if(slen>collen && slen>rowlen)
		{
			System.out.println("No");
			return;
		}
		for(i=0;i<rowlen;i++)
		{
			for(j=0;j<collen;j++)
			{
					if(s.charAt(0)==a[i][j])
					{
						r=i+1;
						c=j;
						flag=true;
						for(k=1;k<slen;k++)
						{
							if(  r<rowlen &&s.charAt(k)!=a[r++][c])
							{
								flag=false;
								break;
							}
						}
						if(flag)
						{
							System.out.println("yes");
							return;
						}
						r=i;
						c=j+1;
						flag=true;
						for(k=1;k<slen;k++)
						{
							if( c<collen && s.charAt(k)!=a[r][c++])
							{
								flag=false;
								break;
							}
									
						}
						if(flag)
						{
							System.out.println("yes");
							return;
						}
					}
			}
		}
		System.out.println("not found");
	}
}