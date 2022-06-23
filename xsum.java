class xsum
{
	public static void main(String args[])
	{
		int a[]={3,8,6,5,9,4,7,12,67,34,33,28},x=4,mod[]=new int[x],i,j,k,count=0,temp,sum;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%x==0)
				a[count++]=a[i];
		}
		for(i=0;i<Math.pow(2,count);i++)
		{
			temp=0;
			sum=0;
			for(k=0;k<mod.length;k++)
				mod[k]=0;
			for(j=0;j<count;j++)
			{
				if((i & 1<<j)!=0)
				{
					mod[j]=a[j];
					sum+=a[j];
					temp++;
				}
			}
			if(temp>1 && sum%x==0)
			{
				for(k=0;k<mod.length;k++)
					if(mod[k]!=0)
						System.out.print(mod[k]+",");
				System.out.println();
			}
		}
		
	}
}