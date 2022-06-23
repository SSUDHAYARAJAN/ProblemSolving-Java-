class rotatematrix
{
	public static void main(String args[])
	{
		int i,j,k=0,temp,matrix[][]={{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}},n=4;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		  for(i=0;i<n;i++)
        {
            for(j=n-1;j>=(n/2);j--)
            {
                temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                k++;
            }
            k=0;
        }
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}