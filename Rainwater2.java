class Rainwater2{
public static void main(String args[])
{
	int height[]={0,1,0,2,1,0};
	int n=height.length;
	int left[]=new int[n];
	int right[]=new int[n];
	int total=0;
	int i,j,max=-1;
	
	//for left max array
	for(i=n-1;i>=0;i--)
	{
		for(j=i-1;j>=0;j--)
		{
			if(height[i]>=max)
				max=height[j];
			else
				max=height[j];
		}
		left[i]=max;
	}
	max=-1;
	//for right max array
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{	
		if(height[i]>=max)
			max=height[i];
		else
			max=height[j];
		}
		right[i]=max;
	}
	//left[0]=0;
	//right[n-1]=0;
	for(i=0;i<n;i++)
		total+=Math.min(left[i],right[i])-height[i];
	for(i=0;i<n;i++)
		System.out.println("left"+left[i]);
	for(i=0;i<n;i++)
		System.out.println("right"+right[i]);
	System.out.println(total);
}
}
