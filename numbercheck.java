//Check if a number ‘a’ is present in another number ‘b.
class numbercheck
{
	public static void main(String args[])
	{
		int a=7867,b=1227867979,tempa=a;
		while(b!=0)
		{
			if(b%10==a%10)
			{
				tempa=a;
				while(tempa!=0)
				{
					if(tempa%10==b%10)
					{
						tempa/=10;
						b/=10;
					}
					else					
					{
						break;
					}
				}
				if(tempa==0)
				{
					System.out.println("yes");
					return;
				}
			}
			else
			{
				b=b/10;
			}
		}
		System.out.println("no");
	}
}