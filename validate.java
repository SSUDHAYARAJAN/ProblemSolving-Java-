import java.util.*;
class validate
{
	public static void main(String args[])
	{
		//m means maximum
		//n means minimum
		Stack <Character> stack=new Stack <Character> ();
		int x=30,y=20,z=50,i,a=x,b=y,c=z;
		String s="(((xmy)ny)ny)my";
		char c1,op,c2;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==')')
			{
				c1=stack.pop();
				op=stack.pop();
				c2=stack.pop();
				stack.pop();
				if(c2=='x'|| c1=='x' )
					a=x;
				if(c2=='y'|| c1=='y')
					b=y;
				//if(c2=='z'|| c1=='z')
					//c=z;
				if(op=='m')
				{ 
					if(a>b)
						stack.push('x');
					else
						stack.push('y'); 
				}
				else
				{
					if(a<b)
						stack.push('x');
					else
						stack.push('y');
				}
				
			}
			else
			{
				stack.push(s.charAt(i));
			}
		}
		System.out.println(stack.peek());
		
	}
}