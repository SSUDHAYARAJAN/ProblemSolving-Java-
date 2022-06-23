class substring
{
	public static void main(String ar[])
	{
		int i,j,a;
		String s1="iam udhaya from madurai",s2="ai";
		int l1=s1.length(),l2=s2.length(),temp;
		boolean flag,notflag=true;
		for(i=0;i<l1-l2+1;i++)
		{
			flag=false;
			if(s1.charAt(i)==s2.charAt(0))
			{
				temp=i;
				for(j=0;j<l2;j++)
				{
					if(s1.charAt(temp)!=s2.charAt(j))
					{
						flag=true;
					}
					if (flag)
					{
						break;
					}
					temp++;
				}
				if(flag==false)
				{
					System.out.println(i);
					notflag=false;
					//if you remove this break, then it is shown multiple occurances of the substring
					break;
				}
			}
		}
		if(notflag)
			System.out.println("string doesnot exists");
		
	}
}