class printstring
{
	public static void main(String args[])
	{
		String s="a1b2c3d4c5",num="";
		char ch=s.charAt(0);
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				ch=s.charAt(i);
			}
			else
			{
				num+=s.charAt(i);
				while((s.charAt(i+1)>='0' && s.charAt(i+1)<='9')&&(i<n-1))
				{
					num+=s.charAt(i+1);
					i++;
				}
				int k=Integer.parseInt(num);
				for(int j=0;j<k;j++)
					System.out.print(ch);
				num="";
			}
		}
	}
}