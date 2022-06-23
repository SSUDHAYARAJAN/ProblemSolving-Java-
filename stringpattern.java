class stringpattern
{
	public static void main(String a[])
	{
		String s1="hello";
		
		int space1=0,len=s1.length(),templen=len-1,space2=len-2,i,j;
		for(i=0;i<len;i++)
		{
			/*if(i==len/2)
			{
				for(j=0;j<len/2;j++)
					System.out.print(" ");
				System.out.println(s1.charAt(len/2));
			}*/
			//else
			//{
			for(j=0;j<space1;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1.charAt(i));
			for(j=0;j<space2;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1.charAt(templen));
			
			space1++;			
			space2-=2;
			if(i==len/2)
			{
				space2=space1;
			}
			templen--;
			System.out.println();
			//}
		}
	}
}