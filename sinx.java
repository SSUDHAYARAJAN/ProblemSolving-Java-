//The equation sin(x) = x – x^3 / 3! + x^5 / 5! – ….
class sinx
{
	//static int fact(int n)
	
	public static void main(String args[])
	{
		float x=90;
		float rad,tempx;
		rad=x*(float)(Math.PI/180);
		tempx=rad;
		int n=10,i;
		float sum=0,f=1,k=2;
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+(rad/f);
			}
			else
			{
				sum=sum-(rad/f);
			}
			f=f*k*(k+1);
			rad=rad*tempx*tempx;
			k+=2;
		}
	System.out.println("sin("+x+")="+sum);
	}
}