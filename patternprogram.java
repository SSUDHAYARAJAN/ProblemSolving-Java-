class patternprogram
{
	public static void main(String args[])
	{
		String s="program",temp="";
		int i,j,n=s.length(),p=n/2,p2=0,space=n-1;
		for(i=0;i<n;i++)
		{
			if(p<n)
			{
				temp+=s.charAt(p);
				p++;
			}
			else
			{
				temp+=s.charAt(p2);
				p2++;
			}
			for(j=0;j<space;j++)
				System.out.print(" ");
			System.out.println(temp);
			space--;
		}
	}
}