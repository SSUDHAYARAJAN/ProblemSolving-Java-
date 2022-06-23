class Rainwater{
public static void main(String args[])
{
	int height[]={0,1,0,2,1,0};
	int n=height.length;
	int left[]=new int[n];
	int right[]=new int[n];
	int total=0;
	int i,j,max=-1;
    for (i=0;i<n;i++)
	{
		if(height[i]>=max)
			max=height[i];
		left[i]=max;
	}
	max=-1;
	for(j=n-1;j>=0;j--)
	{
		if(height[j]>=max)
			max=height[j];
		right[j]=max;
	}
	for(i=0;i<n;i++)
		total+=Math.min(left[i],right[i])-height[i];
	for(i=0;i<n;i++)
		System.out.println("left"+left[i]);
	for(i=0;i<n;i++)
		System.out.println("right"+right[i]);
	System.out.println(total);
}
}