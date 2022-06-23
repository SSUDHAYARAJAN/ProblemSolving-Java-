class towerpattern
{
	public static void main(String args[])
	{
		int n=15,space=n-1+40,value=1,times=n,i,j,k,count=1,l;
		String s="";
		for(i=0;i<n;i++)
		{
			s="";
			if(value==10)
				value=1;
			for(k=0;k<count;k++)
				s+=String.valueOf(value);
			for(int a=0;a<times;a++)
			{
				for(j=0;j<space;j++)
					System.out.print(" ");
			    System.out.println(s);
			}
			space--;
			value++;
			times--;
			count+=2;
		}
	}
}